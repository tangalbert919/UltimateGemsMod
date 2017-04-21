package com.darknesgaming.ultimategems;

import com.darknesgaming.ultimategems.handlers.*;
import com.darknesgaming.ultimategems.world.WorldGenOre;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * We use this to load the models, textures, and everything else in the game.
 * This is for both the Client and the Server side.
 */
public class CommonProxy {
    // Game Registries are initialized and registered during pre-initialization.
    // This includes items, blocks, armor, and world generators.
    public void preInit(FMLPreInitializationEvent event) {
        ItemHandler.init();
        ItemHandler.register();
        BlockHandler.init();
        BlockHandler.register();
        ToolHandler.init();
        ToolHandler.register();
        ArmorHandler.init();
        ArmorHandler.register();
    }
    // Place the world generators in here.
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
    }
    // Recipes must be initialized and registered during post-initialization.
    public void postInit(FMLPostInitializationEvent event) {
        CraftingHandler.init();
        SmeltingHandler.init();
    }
}
