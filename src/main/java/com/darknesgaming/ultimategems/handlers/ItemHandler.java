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
    /*
     * When defining new items, don't make them "private" if used by Crafting or Smelting handler.
     * Make them package-private only if only the other handlers will also use the items.
     * Make them public if used by classes in other packages.
     */
    // Overworld items
    static Item palladiumingot;
    static Item titaniumingot;
    public static Item ruby;
    public static Item sapphire;
    public static Item topaz;
    public static Item peridot;
    public static Item amethyst;
    public static Item beryl;
    public static Item citrine;

    // Items are initialized here.
    public static void init() {
        // The ingots.
        palladiumingot = new ModItem("palladium_ingot", CreativeTabHandler.itemTab);
        titaniumingot = new ModItem("titanium_ingot", CreativeTabHandler.itemTab);
        ruby = new ModItem("ruby", CreativeTabHandler.itemTab);
        sapphire = new ModItem("sapphire", CreativeTabHandler.itemTab);
        topaz = new ModItem("topaz", CreativeTabHandler.itemTab);
        peridot = new ModItem("peridot", CreativeTabHandler.itemTab);
        amethyst = new ModItem("amethyst", CreativeTabHandler.itemTab);
        beryl = new ModItem("beryl", CreativeTabHandler.itemTab);
        citrine = new ModItem("citrine", CreativeTabHandler.itemTab);
    }
    // These items will then be registered.
    public static void register() {
        GameRegistry.register(palladiumingot);
        GameRegistry.register(titaniumingot);
        GameRegistry.register(ruby);
        GameRegistry.register(sapphire);
        GameRegistry.register(topaz);
        GameRegistry.register(peridot);
        GameRegistry.register(amethyst);
        GameRegistry.register(beryl);
        GameRegistry.register(citrine);
    }
    // The rendering is registered so Forge knows where to look for the textures and models.
    public static void registerRenders() {
        registerRender(palladiumingot);
        registerRender(titaniumingot);
        registerRender(ruby);
        registerRender(sapphire);
        registerRender(topaz);
        registerRender(peridot);
        registerRender(amethyst);
        registerRender(beryl);
        registerRender(citrine);
    }
    // This method tells Forge how to look for the textures and models.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
