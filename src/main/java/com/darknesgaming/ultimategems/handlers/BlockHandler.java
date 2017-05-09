package com.darknesgaming.ultimategems.handlers;

import com.darknesgaming.ultimategems.blocks.*;
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
    // Nether ores or blocks
    public static Block netheriron;
    static ItemBlock inetheriron;
    // Overworld ores or blocks.
    public static Block palladiumore;
    static ItemBlock ipalladiumore;
    private static Block palladiumblock;
    static ItemBlock ipalladiumblock;
    public static Block titaniumore;
    static ItemBlock ititaniumore;
    private static Block titaniumblock;
    static ItemBlock ititaniumblock;
    // Blocks are initialized here during pre-initialization.
    public static void init() {
        // Overworld ores or blocks
        palladiumore = new ModBlock(Material.ROCK, "palladium_ore", CreativeTabHandler.blockTab, 4F, 10F, 2, "pickaxe");
        ipalladiumore = new ItemBlock(palladiumore);
        palladiumblock = new ModBlock(Material.ROCK, "palladium_block", CreativeTabHandler.blockTab, 5F, 15F, 2, "pickaxe");
        ipalladiumblock = new ItemBlock(palladiumblock);
        titaniumore = new ModBlock(Material.ROCK, "titanium_ore", CreativeTabHandler.blockTab, 7F, 20F, 3, "pickaxe");
        ititaniumore = new ItemBlock(titaniumore);
        titaniumblock = new ModBlock(Material.ROCK, "titanium_block", CreativeTabHandler.blockTab, 9F, 25F, 3, "pickaxe");
        ititaniumblock = new ItemBlock(titaniumblock);
        // Nether ores
        netheriron = new ModBlock(Material.ROCK, "netherironore", CreativeTabHandler.blockTab, 3F, 10F, 1, "pickaxe");
        inetheriron = new ItemBlock(netheriron);
    }
    // The blocks are then registered during pre-initialization.
    public static void register() {
        // Overworld ores or blocks.
        GameRegistry.register(palladiumore);
        GameRegistry.register(ipalladiumore, palladiumore.getRegistryName());
        GameRegistry.register(palladiumblock);
        GameRegistry.register(ipalladiumblock, palladiumblock.getRegistryName());
        GameRegistry.register(titaniumore);
        GameRegistry.register(ititaniumore, titaniumore.getRegistryName());
        GameRegistry.register(titaniumblock);
        GameRegistry.register(ititaniumblock, titaniumblock.getRegistryName());
        // Nether ores
        GameRegistry.register(netheriron);
        GameRegistry.register(inetheriron, netheriron.getRegistryName());

    }
    // The rendering is registered during initialization.
    public static void registerRenders() {
        // Nether ores
        registerRender(netheriron);
        // Overworld ores or blocks
        registerRender(palladiumore);
        registerRender(palladiumblock);
        registerRender(titaniumore);
        registerRender(titaniumblock);
    }
    // We need to tell Forge how to locate the textures and models.
    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
