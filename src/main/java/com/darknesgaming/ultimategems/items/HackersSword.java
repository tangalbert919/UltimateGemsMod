package com.darknesgaming.ultimategems.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * The hacker's sword. Used by cheaters.
 * "Do you wanna have a bad time?" -Sans
 */
public class HackersSword extends ItemSword {
    public HackersSword(String name, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
