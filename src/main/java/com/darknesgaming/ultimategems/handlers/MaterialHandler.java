package com.darknesgaming.ultimategems.handlers;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * This class handles custom materials that determine the harvest level, durability, efficiency, damage, and durability of a tool when used.
 */
public class MaterialHandler {
    public static Material material;
    static Item.ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("tutorial", 3, 2500, 5F, 5F, 20);
    static Item.ToolMaterial WEAPON = EnumHelper.addToolMaterial("weapon", 1, 3000, 3F, 7F, 20);
    static Item.ToolMaterial AXE = EnumHelper.addToolMaterial("axe", 3, 3000, 8F, 10F, 20);
    static Item.ToolMaterial HACKER = EnumHelper.addToolMaterial("hacker", 3, 32767, 9999F, 9999F, 20);
    static ItemArmor.ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("emerald_armor", "ultimategems:emerald_armor", 1000, new int[]{5,4,3,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8F);
}
