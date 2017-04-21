package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword {
    public EmeraldSword(String name, ToolMaterial material, CreativeTabs tabs) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
    }
}
