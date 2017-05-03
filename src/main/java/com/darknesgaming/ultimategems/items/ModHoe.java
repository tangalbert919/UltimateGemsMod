package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

/**
 * This class is to be used for every hoe.
 * Do not edit for any reason.
 */
public class ModHoe extends ItemHoe {
    public ModHoe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
