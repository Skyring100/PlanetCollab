package com.skyring100.planetcollab.item;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PlanetCollab.MOD_ID);

    public static final RegistryObject<Item> MARS = ITEMS.register("mars", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB)));
    public static final RegistryObject<Item> GHOST_ITEM = ITEMS.register("ghost_item", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DUMB_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
