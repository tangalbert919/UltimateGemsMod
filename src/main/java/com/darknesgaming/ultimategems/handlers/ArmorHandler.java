package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.ModArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class handles custom armor. The common proxy will use this to load and register the
 * armor during pre-initialization.
 */
public class ArmorHandler {
    // Emerald armor
    static Item emeraldHelmet;
    static Item emeraldChestplate;
    static Item emeraldLeggings;
    static Item emeraldBoots;
    // Palladium armor
    static Item palladiumHelmet;
    static Item palladiumChestplate;
    static Item palladiumLeggings;
    static Item palladiumBoots;
    // Titanium armor
    static Item titaniumHelmet;
    static Item titaniumChestplate;
    static Item titaniumLeggings;
    static Item titaniumBoots;
    // Ruby armor
    static Item rubyHelmet;
    static Item rubyChestplate;
    static Item rubyLeggings;
    static Item rubyBoots;
    // Sapphire armor
    static Item sapphireHelmet;
    static Item sapphireChestplate;
    static Item sapphireLeggings;
    static Item sapphireBoots;
    // The armor needs to be initialized first.
    public static void init() {
        emeraldHelmet = new ModArmor("emerald_helmet", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        emeraldChestplate = new ModArmor("emerald_chestplate", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        emeraldLeggings = new ModArmor("emerald_leggings", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        emeraldBoots = new ModArmor("emerald_boots", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        palladiumHelmet = new ModArmor("palladium_helmet", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        palladiumChestplate = new ModArmor("palladium_chestplate", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        palladiumLeggings = new ModArmor("palladium_leggings", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        palladiumBoots = new ModArmor("palladium_boots", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        titaniumHelmet = new ModArmor("titanium_helmet", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        titaniumChestplate = new ModArmor("titanium_chestplate", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        titaniumLeggings = new ModArmor("titanium_leggings", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        titaniumBoots = new ModArmor("titanium_boots", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        rubyHelmet = new ModArmor("ruby_helmet", MaterialHandler.RUBY, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        rubyChestplate = new ModArmor("ruby_chestplate", MaterialHandler.RUBY, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        rubyLeggings = new ModArmor("ruby_leggings", MaterialHandler.RUBY, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        rubyBoots = new ModArmor("ruby_boots", MaterialHandler.RUBY, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        sapphireHelmet = new ModArmor("sapphire_helmet", MaterialHandler.SAPPHIRE, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        sapphireChestplate = new ModArmor("sapphire_chestplate", MaterialHandler.SAPPHIRE, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        sapphireLeggings = new ModArmor("sapphire_leggings", MaterialHandler.SAPPHIRE, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        sapphireBoots = new ModArmor("sapphire_boots", MaterialHandler.SAPPHIRE, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
    }
    // The armor will then be registered.
    public static void register() {
        GameRegistry.register(emeraldHelmet);
        GameRegistry.register(emeraldChestplate);
        GameRegistry.register(emeraldLeggings);
        GameRegistry.register(emeraldBoots);
        GameRegistry.register(palladiumHelmet);
        GameRegistry.register(palladiumChestplate);
        GameRegistry.register(palladiumLeggings);
        GameRegistry.register(palladiumBoots);
        GameRegistry.register(titaniumHelmet);
        GameRegistry.register(titaniumChestplate);
        GameRegistry.register(titaniumLeggings);
        GameRegistry.register(titaniumBoots);
        GameRegistry.register(rubyHelmet);
        GameRegistry.register(rubyChestplate);
        GameRegistry.register(rubyLeggings);
        GameRegistry.register(rubyBoots);
        GameRegistry.register(sapphireHelmet);
        GameRegistry.register(sapphireChestplate);
        GameRegistry.register(sapphireLeggings);
        GameRegistry.register(sapphireBoots);
    }
    // The renderings need to be registered.
    public static void registerRenders() {
        registerRender(emeraldHelmet);
        registerRender(emeraldChestplate);
        registerRender(emeraldLeggings);
        registerRender(emeraldBoots);
        registerRender(palladiumHelmet);
        registerRender(palladiumChestplate);
        registerRender(palladiumLeggings);
        registerRender(palladiumBoots);
        registerRender(titaniumHelmet);
        registerRender(titaniumChestplate);
        registerRender(titaniumLeggings);
        registerRender(titaniumBoots);
        registerRender(rubyHelmet);
        registerRender(rubyChestplate);
        registerRender(rubyLeggings);
        registerRender(rubyBoots);
        registerRender(sapphireHelmet);
        registerRender(sapphireChestplate);
        registerRender(sapphireLeggings);
        registerRender(sapphireBoots);
    }
    // Forge needs to know how to look for the textures and models.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
