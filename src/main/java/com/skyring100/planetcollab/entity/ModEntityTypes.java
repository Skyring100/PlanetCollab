package com.skyring100.planetcollab.entity;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, PlanetCollab.MOD_ID);
    //public static final RegistryObject<EntityType<KineticProjectile>> KINETIC_PROJECTILE = ENTITY_TYPES.register("kinetic_projectile", () -> EntityType.Builder.of(KineticProjectile::new, MobCategory.MISC).build(new ResourceLocation(PlanetCollab.MOD_ID, "kinetic_projectile").toString()));

    public static void register(IEventBus event){
        ENTITY_TYPES.register(event);
    }
}
