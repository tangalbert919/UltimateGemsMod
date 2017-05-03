package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * This class is to be used for every shovel.
 * Do not edit for any reason.
 */
public class ModSpade extends ItemSpade {
    public ModSpade(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
