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
    // Tools are initialized here.
    public static void init() {
        emeraldpickaxe = new EmeraldPickaxe("emerald_pickaxe", MaterialHandler.TUTORIAL, CreativeTabHandler.toolTab);
        emeraldaxe = new EmeraldAxe("emerald_axe", MaterialHandler.AXE, CreativeTabHandler.toolTab);
        emeraldspade = new EmeraldSpade("emerald_spade", MaterialHandler.TUTORIAL, CreativeTabHandler.toolTab);
        emeraldhoe = new EmeraldHoe("emerald_hoe", MaterialHandler.TUTORIAL, CreativeTabHandler.toolTab);
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
