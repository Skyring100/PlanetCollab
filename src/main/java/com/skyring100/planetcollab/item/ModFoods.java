package com.skyring100.planetcollab.item;

import com.skyring100.planetcollab.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties EDIBLE_INSOMNIA = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.CONFUSION, 350, 1), 1.0F).effect(new MobEffectInstance(MobEffects.BLINDNESS, 350, 20), 1.0F).alwaysEat().build();
    public static final FoodProperties MONSTER_MASH = (new FoodProperties.Builder()).nutrition(5).saturationMod(1.0F).effect(new MobEffectInstance(MobEffects.POISON, 350, 5), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 350, 5), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 350, 5), 1.0F).alwaysEat().build();
}
