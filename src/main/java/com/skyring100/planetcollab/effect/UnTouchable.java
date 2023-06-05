package com.skyring100.planetcollab.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

import java.util.ArrayList;

public class UnTouchable extends MobEffect {
    private ArrayList<LivingEntity> cursedMobs = new ArrayList<>();
    protected UnTouchable(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        for(LivingEntity mob : cursedMobs){
            if(mob.doHurtTarget(pLivingEntity)){
                mob.kill();
            }
        }
    }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
