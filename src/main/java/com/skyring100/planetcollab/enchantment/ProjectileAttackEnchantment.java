package com.skyring100.planetcollab.enchantment;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.Level;

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
            WitherSkull witherskull = new WitherSkull(world, (LivingEntity) pAttacker, spawnLocation.getX(), spawnLocation.getY(), spawnLocation.getZ());
            witherskull.setPosRaw(spawnLocation.getX(), spawnLocation.getY(), spawnLocation.getZ());
            world.addFreshEntity(witherskull);

        }

    }
}
