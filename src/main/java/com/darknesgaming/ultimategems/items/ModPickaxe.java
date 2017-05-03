package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * This class is to be used for every pickaxe.
 * Do not edit for any reason.
 */
public class ModPickaxe extends ItemPickaxe {
    public ModPickaxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
    public ModPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
