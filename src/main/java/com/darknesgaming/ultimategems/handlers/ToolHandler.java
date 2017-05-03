package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.ModAxe;
import com.darknesgaming.ultimategems.items.ModHoe;
import com.darknesgaming.ultimategems.items.ModPickaxe;
import com.darknesgaming.ultimategems.items.ModSpade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to handle tools. The common proxy will use this to load and
 * register these tools during pre-initialization.
 */
public class ToolHandler {
    // Emerald Tools
    static Item emeraldpickaxe;
    static Item emeraldaxe;
    static Item emeraldspade;
    static Item emeraldhoe;
    // Palladium Tools
    static Item palladiumpickaxe;
    static Item palladiumaxe;
    static Item palladiumspade;
    static Item palladiumhoe;
    // Titanium Tools
    static Item titaniumpickaxe;
    static Item titaniumaxe;
    static Item titaniumspade;
    static Item titaniumhoe;
    // Tools are initialized here.
    public static void init() {
        emeraldpickaxe = new ModPickaxe("emerald_pickaxe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldaxe = new ModAxe("emerald_axe", MaterialHandler.EMERALD_AXE, CreativeTabHandler.toolTab);
        emeraldspade = new ModSpade("emerald_spade", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldhoe = new ModHoe("emerald_hoe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        // Palladium Tools
        palladiumpickaxe = new ModPickaxe("palladium_pickaxe", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        palladiumaxe = new ModAxe("palladium_axe", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        palladiumspade = new ModSpade("palladium_spade", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        palladiumhoe = new ModHoe("palladium_hoe", MaterialHandler.PALLADIUM_TOOL, CreativeTabHandler.toolTab);
        // Titanium Tools
        titaniumpickaxe = new ModPickaxe("titanium_pickaxe", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);
        titaniumaxe = new ModAxe("titanium_axe", MaterialHandler.TITANIUM_AXE, CreativeTabHandler.toolTab);
        titaniumspade = new ModSpade("titanium_spade", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);
        titaniumhoe = new ModHoe("titanium_hoe", MaterialHandler.TITANIUM_TOOL, CreativeTabHandler.toolTab);

    }
    // These tools will then be registered.
    public static void register() {
        GameRegistry.register(emeraldaxe);
        GameRegistry.register(emeraldhoe);
        GameRegistry.register(emeraldpickaxe);
        GameRegistry.register(emeraldspade);
        GameRegistry.register(palladiumaxe);
        GameRegistry.register(palladiumhoe);
        GameRegistry.register(palladiumpickaxe);
        GameRegistry.register(palladiumspade);
        GameRegistry.register(titaniumaxe);
        GameRegistry.register(titaniumpickaxe);
        GameRegistry.register(titaniumhoe);
        GameRegistry.register(titaniumspade);
    }
    // The renderings need to be registered as well.
    public static void registerRenders() {
        registerRender(emeraldaxe);
        registerRender(emeraldhoe);
        registerRender(emeraldpickaxe);
        registerRender(emeraldspade);
        registerRender(palladiumaxe);
        registerRender(palladiumhoe);
        registerRender(palladiumpickaxe);
        registerRender(palladiumspade);
        registerRender(titaniumaxe);
        registerRender(titaniumhoe);
        registerRender(titaniumpickaxe);
        registerRender(titaniumspade);
    }
    // Forge needs to know how to search for the models and textures.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
