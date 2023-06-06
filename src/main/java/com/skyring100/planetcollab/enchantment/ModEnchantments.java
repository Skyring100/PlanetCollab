package com.skyring100.planetcollab.enchantment;

import com.skyring100.planetcollab.PlanetCollab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PlanetCollab.MOD_ID);

    public static RegistryObject<Enchantment> PROJECTILE_ATTACK = ENCHANTMENTS.register("projectile_attack", () -> new ProjectileAttackEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus event){
        ENCHANTMENTS.register(event);
    }
}
