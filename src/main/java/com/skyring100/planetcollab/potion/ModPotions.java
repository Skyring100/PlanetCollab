package com.skyring100.planetcollab.potion;

import com.skyring100.planetcollab.PlanetCollab;
import com.skyring100.planetcollab.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, PlanetCollab.MOD_ID);

    public static final RegistryObject<Potion> EXTREME_INSOMNIA_POTION = POTIONS.register("extreme_insomnia_potion", () -> new Potion(new MobEffectInstance(ModEffects.EXTREME_INSOMNIA.get(), 150000, 0)));

    public static void register(IEventBus event){
        POTIONS.register(event);
    }
}
