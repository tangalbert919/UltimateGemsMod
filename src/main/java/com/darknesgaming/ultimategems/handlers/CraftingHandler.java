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
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldpickaxe, 1), "XXX", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldaxe, 1), "XX ", "XC ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldhoe, 1), "XX ", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ToolHandler.emeraldspade, 1), " X ", " C ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ItemHandler.emeraldsword, 1), " X ", " X ", " C ", 'X', Items.EMERALD, 'C', Items.STICK);
        // Armor
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldHelmet, 1), "XXX", "X X", "   ", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldChestplate, 1), "X X", "XXX", "XXX", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldLeggings, 1), "XXX", "X X", "X X", 'X', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ArmorHandler.emeraldBoots, 1), "   ", "X X", "X X", 'X', Items.EMERALD);
        // Overworld blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.palladiumingot, 9), BlockHandler.ipalladiumblock);
        GameRegistry.addRecipe(new ItemStack(BlockHandler.ipalladiumblock, 1), "XXX", "XXX", "XXX", 'X', ItemHandler.palladiumingot);
    }
}
