package com.skyring100.planetcollab.effect;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class SpitefulRush extends MobEffect {
    private final int startDelay = 100;
    private int tickDelay = 0;
    private final int maxDelay = 10;
    protected SpitefulRush(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.isSprinting()){
            addAttributeModifiers(pLivingEntity,pLivingEntity.getAttributes(),5+pAmplifier);
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 45, 30));
            tickDelay = 0;
        }else if (tickDelay < maxDelay){
            tickDelay++;
        }else {
            pLivingEntity.hurt(DamageSource.MAGIC, 5f);
        }
    }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
