package com.skyring100.planetcollab.effect;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

public class VillainousNitrate extends MobEffect {
    protected VillainousNitrate(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        /*
        if(pLivingEntity instanceof Player){
            Player p = (Player) pLivingEntity;
            p.sendMessage(new TextComponent(p.getKillCredit().toString()),p.getUUID());
        }
         */
        //if the entity is killed, it will be set to null
        /*
        if(){
            pLivingEntity.sendMessage(new TextComponent("yeah hurt it"), pLivingEntity.getUUID());
            pLivingEntity.setHealth(pLivingEntity.getMaxHealth());
        }else{
            pLivingEntity.hurt(DamageSource.MAGIC, 5f);
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);

         */
    }
    /**
     * Checks if potion effect should continue
     * @param pDuration
     * @param pAmplifier
     * @return
     */
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
