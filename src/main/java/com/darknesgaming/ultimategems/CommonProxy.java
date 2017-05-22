package com.darknesgaming.ultimategems;

import api.slimeknights.tconstruct.IMCHandler;
import com.darknesgaming.ultimategems.handlers.*;
import com.darknesgaming.ultimategems.world.WorldGenOre;
import com.darknesgaming.ultimategems.world.WorldHacker;
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
        WeaponHandler.init();
        WeaponHandler.register();
        IMCHandler.init();
        IMCHandler.register();
        IMCHandler.addBlocks();
        //HackerHandler.init();
        //HackerHandler.register();
    }
    // Place the world generators in here.
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
        //GameRegistry.registerWorldGenerator(new WorldHacker(), 0);
    }
    // Recipes must be initialized and registered during post-initialization.
    public void postInit(FMLPostInitializationEvent event) {
        CraftingHandler.init();
        SmeltingHandler.init();
    }
}
