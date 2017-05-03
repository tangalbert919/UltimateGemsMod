package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.EmeraldArmor;
import com.darknesgaming.ultimategems.items.PalladiumArmor;
import com.darknesgaming.ultimategems.items.TitaniumArmor;
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
    // The armor needs to be initialized first.
    public static void init() {
        emeraldHelmet = new EmeraldArmor("emerald_helmet", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        emeraldChestplate = new EmeraldArmor("emerald_chestplate", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        emeraldLeggings = new EmeraldArmor("emerald_leggings", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        emeraldBoots = new EmeraldArmor("emerald_boots", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        palladiumHelmet = new PalladiumArmor("palladium_helmet", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        palladiumChestplate = new PalladiumArmor("palladium_chestplate", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        palladiumLeggings = new PalladiumArmor("palladium_leggings", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        palladiumBoots = new PalladiumArmor("palladium_boots", MaterialHandler.PALLADIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
        titaniumHelmet = new TitaniumArmor("titanium_helmet", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        titaniumChestplate = new TitaniumArmor("titanium_chestplate", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        titaniumLeggings = new TitaniumArmor("titanium_leggings", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        titaniumBoots = new TitaniumArmor("titanium_boots", MaterialHandler.TITANIUM, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
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
    }
    // Forge needs to know how to look for the textures and models.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
