package com.darknesgaming.ultimategems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
/**
 * This class is usually NEVER modified unless we are changing the version.
 */
public class Main {

    public static final String MODID = "ultimategems";
    public static final String VERSION = "Prototype build";

    @SidedProxy(clientSide = "com.darknesgaming.ultimategems.ClientProxy", serverSide = "com.darknesgaming.ultimategems.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        this.proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }
}
