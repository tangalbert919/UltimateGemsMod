package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.items.EmeraldAxe;
import com.darknesgaming.ultimategems.items.EmeraldHoe;
import com.darknesgaming.ultimategems.items.EmeraldPickaxe;
import com.darknesgaming.ultimategems.items.EmeraldSpade;
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
    // TODO: Create class files and textures for these tools.
    static Item palladiumpickaxe;
    static Item palladiumaxe;
    static Item palladiumspade;
    static Item palladoumhoe;
    // Titanium Tools
    static Item titaniumpickaxe;
    static Item titaniumaxe;
    static Item titaniumspade;
    static Item titaniumhoe;
    // Tools are initialized here.
    public static void init() {
        emeraldpickaxe = new EmeraldPickaxe("emerald_pickaxe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldaxe = new EmeraldAxe("emerald_axe", MaterialHandler.EMERALD_AXE, CreativeTabHandler.toolTab);
        emeraldspade = new EmeraldSpade("emerald_spade", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
        emeraldhoe = new EmeraldHoe("emerald_hoe", MaterialHandler.EMERALD_TOOL, CreativeTabHandler.toolTab);
    }
    // These tools will then be registered.
    public static void register() {
        GameRegistry.register(emeraldaxe);
        GameRegistry.register(emeraldhoe);
        GameRegistry.register(emeraldpickaxe);
        GameRegistry.register(emeraldspade);
    }
    // The renderings need to be registered as well.
    public static void registerRenders() {
        registerRender(emeraldaxe);
        registerRender(emeraldhoe);
        registerRender(emeraldpickaxe);
        registerRender(emeraldspade);
    }
    // Forge needs to know how to search for the models and textures.
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
