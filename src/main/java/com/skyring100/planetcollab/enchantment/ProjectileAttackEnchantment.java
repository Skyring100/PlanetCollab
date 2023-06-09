package com.skyring100.planetcollab.enchantment;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ProjectileAttackEnchantment extends Enchantment {
    protected ProjectileAttackEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pTarget, Entity pAttacker, int pLevel) {
        if(!pAttacker.level.isClientSide()){
            ServerLevel world = (ServerLevel) pAttacker.level;
            BlockPos spawnLocation = pAttacker.blockPosition().offset(0,2,0);
            float x = spawnLocation.getX();
            float y = spawnLocation.getY();
            float z = spawnLocation.getZ();
            WitherSkull witherskull = new WitherSkull(world, (LivingEntity) pAttacker, x, y, z);
            witherskull.setPosRaw(x, y, z);
            witherskull.lookAt(EntityAnchorArgument.Anchor.EYES, pTarget.position());
            world.addFreshEntity(witherskull);
        }
    }
}
