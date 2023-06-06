package com.skyring100.planetcollab.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

public class ProjectileAttackEnchantment extends Enchantment {
    protected ProjectileAttackEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pTarget, Entity pAttacker, int pLevel) {
        pAttacker.sendMessage(new TextComponent("hIT WITH ENCHANT!"), pAttacker.getUUID());
        if(!pAttacker.level.isClientSide()){
            ServerLevel world = (ServerLevel) pAttacker.level;
            BlockPos spawnLocation = pAttacker.blockPosition().offset(0,10,0);
            pAttacker.sendMessage(new TextComponent("Ready? Here it comes!"), pAttacker.getUUID());

            Entity projectile =  EntityType.DRAGON_FIREBALL.spawn(world, null, null, spawnLocation, MobSpawnType.DISPENSER, true, true);

            projectile.setDeltaMovement(pTarget.position());
        }

    }
}
