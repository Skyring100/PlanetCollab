package com.skyring100.planetcollab.effect;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect>  MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PlanetCollab.MOD_ID);

    public static final RegistryObject<MobEffect> VILLAINOUS_NITRATE = MOB_EFFECTS.register("villainous_nitrate", () -> new VillainousNitrate(MobEffectCategory.NEUTRAL, 0));
    public static final RegistryObject<MobEffect> EXTREME_INSOMNIA = MOB_EFFECTS.register("extreme_insomnia", () -> new ExtremeInsomnia(MobEffectCategory.HARMFUL, 200));
    public static final RegistryObject<MobEffect> SPITEFUL_RUSH = MOB_EFFECTS.register("spiteful_rush", () -> new SpitefulRush(MobEffectCategory.NEUTRAL, 1323).addAttributeModifier(Attributes.ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 1.0D, AttributeModifier.Operation.ADDITION));
    public static void register(IEventBus event){
        MOB_EFFECTS.register(event);
    }
}
