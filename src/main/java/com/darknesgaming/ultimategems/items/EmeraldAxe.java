package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class EmeraldAxe extends ItemAxe {
    public EmeraldAxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
