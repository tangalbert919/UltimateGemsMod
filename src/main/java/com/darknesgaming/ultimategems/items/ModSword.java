package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * This class file is to be used for every sword.
 * This should not be edited for any reason.
 */
public class ModSword extends ItemSword {
    public ModSword(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
    public ModSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
