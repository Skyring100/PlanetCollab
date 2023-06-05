package com.skyring100.planetcollab.block;

import com.skyring100.planetcollab.PlanetCollab;
import com.skyring100.planetcollab.block.custom.Snail;
import com.skyring100.planetcollab.item.ModCreativeModeTab;
import com.skyring100.planetcollab.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PlanetCollab.MOD_ID);


    public static final RegistryObject<Block> GHOST_BLOCK = registerBlock("ghost_block", () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(1f)), ModCreativeModeTab.DUMB_TAB);
    public static final RegistryObject<Block> SNAIL = registerBlock("snail", () -> new Snail(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).strength(1f).noOcclusion().sound(SoundType.SLIME_BLOCK)), ModCreativeModeTab.MAIN_TAB);
    public static final RegistryObject<Block> NERD_BLOCK = registerBlock("nerd_block", () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE).strength(1f)), ModCreativeModeTab.DUMB_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
       RegistryObject<T> toReturn  = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn, tab);
       return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
