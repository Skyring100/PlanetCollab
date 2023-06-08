package com.skyring100.planetcollab.entity.custom.projectiles;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class KineticProjectile extends AbstractHurtingProjectile {

    public KineticProjectile(EntityType<? extends AbstractHurtingProjectile> pEntityType, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        super(pEntityType, pShooter, pOffsetX, pOffsetY, pOffsetZ, pLevel);
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        Entity receiver = pResult.getEntity();
        if(!receiver.getLevel().isClientSide()){
            receiver.hurt(DamageSource.MAGIC, 3);
        }
    }
}
