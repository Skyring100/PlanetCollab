package com.skyring100.planetcollab.entity;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, PlanetCollab.MOD_ID);

    public static void register(IEventBus event){
        ENTITY_TYPES.register(event);
    }
}
