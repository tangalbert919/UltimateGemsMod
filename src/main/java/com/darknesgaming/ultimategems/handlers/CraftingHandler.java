package com.darknesgaming.ultimategems.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class handles custom crafting recipes for items in this mod.
 * These recipes are added during post-initialization.
 */
public class CraftingHandler {
    public static void init() {
        // Emerald Tools
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldpickaxe, 1), "XXX", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldaxe, 1), "XX ", "XC ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldhoe, 1), "XX ", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldspade, 1), " X ", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(WeaponHandler.emeraldsword, 1), " X ", " X ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        // Palladium Tools
        GameRegistry.addRecipe(new ItemStack(ToolHandler.palladiumpickaxe, 1), "XXX", " C ", " C ", 'X', ItemHandler.palladiumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.palladiumaxe, 1), "XX ", "XC ", " C ", 'X', ItemHandler.palladiumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.palladiumhoe, 1), "XX ", " C ", " C ", 'X', ItemHandler.palladiumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.palladiumspade, 1), " X ", " C ", " C ", 'X', ItemHandler.palladiumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(WeaponHandler.palladiumsword, 1), " X ", " X ", " C ", 'X', ItemHandler.palladiumingot, 'C', Items.STICK);
        // Titanium Tools
        GameRegistry.addRecipe(new ItemStack(ToolHandler.titaniumpickaxe, 1), "XXX", " C ", " C ", 'X', ItemHandler.titaniumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.titaniumaxe, 1), "XX ", "XC ", " C ", 'X', ItemHandler.titaniumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.titaniumhoe, 1), "XX ", " C ", " C ", 'X', ItemHandler.titaniumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.titaniumspade, 1), " X ", " C ", " C ", 'X', ItemHandler.titaniumingot, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(WeaponHandler.titaniumsword, 1), " X ", " X ", " C ", 'X', ItemHandler.titaniumingot, 'C', Items.STICK);
        // Armor
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldHelmet, 1), "XXX", "X X", "   ", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldChestplate, 1), "X X", "XXX", "XXX", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldLeggings, 1), "XXX", "X X", "X X", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldBoots, 1), "   ", "X X", "X X", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.palladiumHelmet, 1), "XXX", "X X", "   ", 'X', ItemHandler.palladiumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.palladiumChestplate, 1), "X X", "XXX", "XXX", 'X', ItemHandler.palladiumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.palladiumLeggings, 1), "XXX", "X X", "X X", 'X', ItemHandler.palladiumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.palladiumBoots, 1), "   ", "X X", "X X", 'X', ItemHandler.palladiumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.titaniumHelmet, 1), "XXX", "X X", "   ", 'X', ItemHandler.titaniumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.titaniumChestplate, 1), "X X", "XXX", "XXX", 'X', ItemHandler.titaniumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.titaniumLeggings, 1), "XXX", "X X", "X X", 'X', ItemHandler.titaniumingot);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.titaniumBoots, 1), "   ", "X X", "X X", 'X', ItemHandler.titaniumingot);
        // Overworld blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.palladiumingot, 9), BlockHandler.ipalladiumblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.ipalladiumblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.palladiumingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.titaniumingot, 9), BlockHandler.ititaniumblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.ititaniumblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.titaniumingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.ruby, 9), BlockHandler.irubyblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.irubyblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.ruby);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.sapphire, 9), BlockHandler.isapphireblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.isapphireblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.sapphire);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.topaz, 9), BlockHandler.itopazblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.itopazblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.topaz);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.peridot, 9), BlockHandler.iperidotblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.iperidotblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.peridot);
    }
}
