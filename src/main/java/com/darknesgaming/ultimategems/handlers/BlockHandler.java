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
    public static Block rubyore;
    private static ItemBlock irubyore;
    private static Block rubyblock;
    static ItemBlock irubyblock;
    public static Block sapphireore;
    private static ItemBlock isapphireore;
    private static Block sapphireblock;
    static ItemBlock isapphireblock;
    public static Block topazore;
    private static ItemBlock itopazore;
    private static Block topazblock;
    static ItemBlock itopazblock;
    public static Block peridotore;
    private static ItemBlock iperidotore;
    private static Block peridotblock;
    static ItemBlock iperidotblock;
    public static Block amethystore;
    private static ItemBlock iamethystore;
    private static Block amethystblock;
    static ItemBlock iamethystblock;
    public static Block berylore;
    private static ItemBlock iberylore;
    private static Block berylblock;
    static ItemBlock iberylblock;
    public static Block citrineore;
    private static ItemBlock icitrineore;
    private static Block citrineblock;
    static ItemBlock icitrineblock;

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
        rubyore = new ModOre(Material.ROCK, "ruby_ore", CreativeTabHandler.blockTab, 6F, 14F, 2, "pickaxe");
        irubyore = new ItemBlock(rubyore);
        rubyblock = new ModBlock(Material.ROCK, "ruby_block", CreativeTabHandler.blockTab, 8F, 14F, 2, "pickaxe");
        irubyblock = new ItemBlock(rubyblock);
        sapphireore = new ModOre(Material.ROCK, "sapphire_ore", CreativeTabHandler.blockTab, 6F, 14F, 2, "pickaxe");
        isapphireore = new ItemBlock(sapphireore);
        sapphireblock = new ModBlock(Material.ROCK, "sapphire_block", CreativeTabHandler.blockTab, 8F, 14F, 2, "pickaxe");
        isapphireblock = new ItemBlock(sapphireblock);
        topazore = new ModOre(Material.ROCK, "topaz_ore", CreativeTabHandler.blockTab, 6F, 14F, 2, "pickaxe");
        itopazore = new ItemBlock(topazore);
        topazblock = new ModBlock(Material.ROCK, "topaz_block", CreativeTabHandler.blockTab, 8F, 14F, 2, "pickaxe");
        itopazblock = new ItemBlock(topazblock);
        peridotore = new ModOre(Material.ROCK, "peridot_ore", CreativeTabHandler.blockTab, 6F, 14F, 2, "pickaxe");
        iperidotore = new ItemBlock(peridotore);
        peridotblock = new ModBlock(Material.ROCK, "peridot_block", CreativeTabHandler.blockTab, 8F, 14F, 2, "pickaxe");
        iperidotblock = new ItemBlock(peridotblock);
        amethystore = new ModOre(Material.ROCK, "amethyst_ore", CreativeTabHandler.blockTab, 6F, 11F, 3, "pickaxe");
        iamethystore = new ItemBlock(amethystore);
        amethystblock = new ModBlock(Material.ROCK, "amethyst_block", CreativeTabHandler.blockTab, 8F, 11F, 3, "pickaxe");
        iamethystblock = new ItemBlock(amethystblock);
        berylore = new ModOre(Material.ROCK, "beryl_ore", CreativeTabHandler.blockTab, 6F, 11F, 2, "pickaxe");
        iberylore = new ItemBlock(berylore);
        berylblock = new ModBlock(Material.ROCK, "beryl_block", CreativeTabHandler.blockTab, 8F, 11F, 2, "pickaxe");
        iberylblock = new ItemBlock(berylblock);
        citrineore = new ModOre(Material.ROCK, "citrine_ore", CreativeTabHandler.blockTab, 6F, 11F, 2, "pickaxe");
        icitrineore = new ItemBlock(citrineore);
        citrineblock = new ModBlock(Material.ROCK, "citrine_block", CreativeTabHandler.blockTab, 8F, 11F, 2, "pickaxe");
        icitrineblock = new ItemBlock(citrineblock);

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
        GameRegistry.register(rubyore);
        GameRegistry.register(irubyore, rubyore.getRegistryName());
        GameRegistry.register(rubyblock);
        GameRegistry.register(irubyblock, rubyblock.getRegistryName());
        GameRegistry.register(sapphireore);
        GameRegistry.register(isapphireore, sapphireore.getRegistryName());
        GameRegistry.register(sapphireblock);
        GameRegistry.register(isapphireblock, sapphireblock.getRegistryName());
        GameRegistry.register(topazore);
        GameRegistry.register(itopazore, topazore.getRegistryName());
        GameRegistry.register(topazblock);
        GameRegistry.register(itopazblock, topazblock.getRegistryName());
        GameRegistry.register(peridotore);
        GameRegistry.register(iperidotore, peridotore.getRegistryName());
        GameRegistry.register(peridotblock);
        GameRegistry.register(iperidotblock, peridotblock.getRegistryName());
        GameRegistry.register(amethystore);
        GameRegistry.register(iamethystore, amethystore.getRegistryName());
        GameRegistry.register(amethystblock);
        GameRegistry.register(iamethystblock, amethystblock.getRegistryName());
        GameRegistry.register(berylore);
        GameRegistry.register(iberylore, berylore.getRegistryName());
        GameRegistry.register(berylblock);
        GameRegistry.register(iberylblock, berylblock.getRegistryName());
        GameRegistry.register(citrineore);
        GameRegistry.register(icitrineore, citrineore.getRegistryName());
        GameRegistry.register(citrineblock);
        GameRegistry.register(icitrineblock, citrineblock.getRegistryName());
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
        registerRender(rubyore);
        registerRender(rubyblock);
        registerRender(sapphireore);
        registerRender(sapphireblock);
        registerRender(topazore);
        registerRender(topazblock);
        registerRender(peridotore);
        registerRender(peridotblock);
        registerRender(amethystore);
        registerRender(amethystblock);
        registerRender(berylore);
        registerRender(berylblock);
        registerRender(citrineore);
        registerRender(citrineblock);
    }
    // We need to tell Forge how to locate the textures and models.
    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
