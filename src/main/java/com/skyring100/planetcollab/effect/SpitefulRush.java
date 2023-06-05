package com.skyring100.planetcollab.effect;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class SpitefulRush extends MobEffect {
    private final int startDelay = 100;
    private boolean isBeginning;
    private int tickDelay;
    private final int maxDelay = 10;
    protected SpitefulRush(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
        isBeginning = true;
        tickDelay = 0;
    }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(tickDelay == 0){
            pLivingEntity.sendMessage(new TextComponent("Start? "+isBeginning), pLivingEntity.getUUID());
        }
        if(tickDelay <= startDelay && isBeginning){
            tickDelay++;
            if(tickDelay == startDelay){
                isBeginning = false;
            }
        }else{
            if(pLivingEntity.isSprinting()){
                if(!pLivingEntity.hasEffect(MobEffects.DAMAGE_BOOST)){
                    pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 20));
                }
                tickDelay = 0;
            }else if (tickDelay < maxDelay){
                tickDelay++;
            }else {
                if(pLivingEntity.hasEffect(MobEffects.DAMAGE_BOOST)){
                    pLivingEntity.removeEffect(MobEffects.DAMAGE_BOOST);
                }
                pLivingEntity.hurt(DamageSource.MAGIC, 6f);
            }
        }
    }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
