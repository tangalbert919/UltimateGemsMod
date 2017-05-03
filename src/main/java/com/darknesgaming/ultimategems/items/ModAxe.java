package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * This class is to be used for every axe.
 * Do not edit for any reason.
 */
public class ModAxe extends ItemAxe {
    public ModAxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
    public ModAxe(String name, ToolMaterial material) {
        super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
