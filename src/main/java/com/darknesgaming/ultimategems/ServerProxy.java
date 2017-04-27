package com.darknesgaming.ultimategems;

import com.darknesgaming.ultimategems.handlers.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Tile Entities are placed here. This is happening on the Server side.
 */
public class ServerProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }
    // Place the renderings here.
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ItemHandler.registerRenders();
        BlockHandler.registerRenders();
        ToolHandler.registerRenders();
        ArmorHandler.registerRenders();
        WeaponHandler.registerRenders();
        // HackerHander.registerRenders();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
