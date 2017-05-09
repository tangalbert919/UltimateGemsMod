package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * When making new items, please extend to this class file.
 * This is used to add new items to the game.
 */
public class ModItem extends Item {
    public ModItem(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
    // This constructor is used for any items with a certain stack size.
    public ModItem(String name, CreativeTabs tab, int stacksize) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(stacksize);
    }
}
