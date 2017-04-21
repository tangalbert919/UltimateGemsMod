package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.EmeraldArmor;
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
    static Item emeraldHelmet;
    static Item emeraldChestplate;
    static Item emeraldLeggings;
    static Item emeraldBoots;
    // The armor needs to be initialized first.
    public static void init() {
        emeraldHelmet = new EmeraldArmor("emerald_helmet", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.HEAD);
        emeraldChestplate = new EmeraldArmor("emerald_chestplate", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.CHEST);
        emeraldLeggings = new EmeraldArmor("emerald_leggings", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 2, EntityEquipmentSlot.LEGS);
        emeraldBoots = new EmeraldArmor("emerald_boots", MaterialHandler.EMERALD, CreativeTabHandler.weaponTab, 1, EntityEquipmentSlot.FEET);
    }
    // The armor will then be registered.
    public static void register() {
        GameRegistry.register(emeraldHelmet);
        GameRegistry.register(emeraldChestplate);
        GameRegistry.register(emeraldLeggings);
        GameRegistry.register(emeraldBoots);
    }
    // The renderings need to be registered.
    public static void registerRenders() {
        registerRender(emeraldHelmet);
        registerRender(emeraldChestplate);
        registerRender(emeraldLeggings);
        registerRender(emeraldBoots);
    }
    // Forge needs to know how to look for the textures and models.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
