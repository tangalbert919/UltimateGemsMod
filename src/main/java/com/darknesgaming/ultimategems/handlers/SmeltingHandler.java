package com.darknesgaming.ultimategems.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class handles custom smelting recipes for items in this mod.
 * These recipes are added during post-initialization.
 */
public class SmeltingHandler {
    public static void init() {
        // Overworld ores
        GameRegistry.addSmelting(BlockHandler.ipalladiumore, new ItemStack(ItemHandler.palladiumingot), 1.0F);
        // Nether ores
        GameRegistry.addSmelting(BlockHandler.inetheriron, new ItemStack(Items.IRON_INGOT), 1.0F);
    }
}
