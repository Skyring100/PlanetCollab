package com.skyring100.planetcollab.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("maintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MARS.get());
        }
    };
    public static final CreativeModeTab DUMB_TAB = new CreativeModeTab("dumbtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GHOST_ITEM.get());
        }
    };
}
