package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ModArmor extends ItemArmor {
    public ModArmor(String name, ArmorMaterial material, CreativeTabs tab, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
