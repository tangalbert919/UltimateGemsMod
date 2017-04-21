package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.blocks.BasicBlock;
import com.darknesgaming.ultimategems.blocks.NetherIronOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to handle blocks. The common proxy will use this to load and register the
 * blocks during pre-initialization.
 */
public class BlockHandler {
    public static Block block;
    private static ItemBlock iblock;
    public static Block netheriron;
    public static ItemBlock inetheriron;
    // Blocks are initialized here.
    public static void init() {
        block = new BasicBlock(Material.ROCK, "basicblock", CreativeTabHandler.blockTab, 5F, 15F, 3, "pickaxe");
        iblock = new ItemBlock(block);
        netheriron = new NetherIronOre(Material.ROCK, "netherironore", CreativeTabHandler.blockTab, 1F, 10F, 2, "pickaxe");
        inetheriron = new ItemBlock(netheriron);
    }
    // The blocks are then registered.
    public static void register() {
        // Basic ore, texture needs work.
        GameRegistry.register(block);
        GameRegistry.register(iblock, block.getRegistryName());
        // Nether ores
        GameRegistry.register(netheriron);
        GameRegistry.register(inetheriron);

    }
    // The rendering is also registered.
    public static void registerRenders() {
        registerRender(block);
    }
    // We need to tell Forge how to locate the textures and models.
    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
