package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to handle items. The common proxy will use this to load and register the
 * items during pre-initialization.
 */
public class ItemHandler {
    // When defining new items, don't make them "private" if used by Crafting or Smelting handler.
    // Make them package-private only if only the other handlers will also use the items.
    // Make them public if used by classes in other packages.
    public static Item item; // Basic item

    // New ingots
    static Item palladiumingot;

    static Item emeraldsword;
    // Items are initialized here.
    public static void init() {
        // For every item initialized, it has a registry name and a tab they will reside in.
        // This is the basic item.
        item = new BasicItem("basicitem", CreativeTabHandler.itemTab);
        // The ingots.
        palladiumingot = new PalladiumIngot("palladium_ingot", CreativeTabHandler.itemTab);
        // This will be moved to its own handler soon.
        emeraldsword = new EmeraldSword("emerald_sword", MaterialHandler.WEAPON, CreativeTabHandler.weaponTab);
    }
    // These items will then be registered.
    public static void register() {
        GameRegistry.register(item);
        GameRegistry.register(emeraldsword);
        GameRegistry.register(palladiumingot);
    }
    // The rendering is registered so Forge knows where to look for the textures and models.
    public static void registerRenders() {
        registerRender(item);
        registerRender(emeraldsword);
        registerRender(palladiumingot);
    }
    // This method tells Forge how to look for the textures and models.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
