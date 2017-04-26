package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.blocks.BasicBlock;
import com.darknesgaming.ultimategems.blocks.NetherIronOre;
import com.darknesgaming.ultimategems.blocks.PalladiumBlock;
import com.darknesgaming.ultimategems.blocks.PalladiumOre;
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
    // Nether ores or blocks
    public static Block netheriron;
    static ItemBlock inetheriron;
    // Overworld ores or blocks.
    public static Block palladiumore;
    static ItemBlock ipalladiumore;
    public static Block palladiumblock;
    static ItemBlock ipalladiumblock;
    // Blocks are initialized here.
    public static void init() {
        // Delete this soon, or rename the class file.
        block = new BasicBlock(Material.ROCK, "basicblock", CreativeTabHandler.blockTab, 5F, 15F, 3, "pickaxe");
        iblock = new ItemBlock(block);
        // Overworld ores or blocks
        palladiumore = new PalladiumOre(Material.ROCK, "palladium_ore", CreativeTabHandler.blockTab, 4F, 10F, 3, "pickaxe");
        ipalladiumore = new ItemBlock(palladiumore);
        palladiumblock = new PalladiumBlock(Material.ROCK, "palladium_block", CreativeTabHandler.blockTab, 6F, 15F, 3, "pickaxe");
        ipalladiumblock = new ItemBlock(palladiumblock);
        // Nether ores
        netheriron = new NetherIronOre(Material.ROCK, "netherironore", CreativeTabHandler.blockTab, 3F, 10F, 2, "pickaxe");
        inetheriron = new ItemBlock(netheriron);
    }
    // The blocks are then registered.
    public static void register() {
        // Basic ore, texture needs work.
        GameRegistry.register(block);
        GameRegistry.register(iblock, block.getRegistryName());
        // Overworld ores or blocks.
        GameRegistry.register(palladiumore);
        GameRegistry.register(ipalladiumore, palladiumore.getRegistryName());
        GameRegistry.register(palladiumblock);
        GameRegistry.register(ipalladiumblock, palladiumblock.getRegistryName());
        // Nether ores
        GameRegistry.register(netheriron);
        GameRegistry.register(inetheriron, netheriron.getRegistryName());

    }
    // The rendering is also registered.
    public static void registerRenders() {
        registerRender(block);
        // Nether ores
        registerRender(netheriron);
        // Overworld ores or blocks
        registerRender(palladiumore);
        registerRender(palladiumblock);
    }
    // We need to tell Forge how to locate the textures and models.
    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
