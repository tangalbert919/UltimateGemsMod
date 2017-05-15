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
    static Item.ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("emerald_tool", 3, 2540, 6F, 5F, 12);
    static Item.ToolMaterial EMERALD_WEAPON = EnumHelper.addToolMaterial("emerald_weapon", 1, 2540, 3F, 7F, 12);
    static Item.ToolMaterial EMERALD_AXE = EnumHelper.addToolMaterial("emerald_axe", 3, 2540, 5F, 5F, 12);
    // Palladium material modifiers.
    static Item.ToolMaterial PALLADIUM_TOOL = EnumHelper.addToolMaterial("palladium_tool", 2, 548, 5F, 3F, 8);
    static Item.ToolMaterial PALLADIUM_WEAPON = EnumHelper.addToolMaterial("palladium_weapon", 1, 548, 2F, 4F, 8);
    static Item.ToolMaterial PALLADIUM_AXE = EnumHelper.addToolMaterial("palladium_axe", 2, 548, 3F, 3F, 8);
    // Titanium material modifiers.
    static Item.ToolMaterial TITANIUM_TOOL = EnumHelper.addToolMaterial("titanium_tool", 3, 3529, 8F, 7F, 16);
    static Item.ToolMaterial TITANIUM_WEAPON = EnumHelper.addToolMaterial("titanium_weapon", 3, 3529, 6F, 9F, 16);
    static Item.ToolMaterial TITANIUM_AXE = EnumHelper.addToolMaterial("titanium_axe", 3, 3529, 5F, 6F, 16);
    // Ruby and Sapphire
    static Item.ToolMaterial RS_TOOL = EnumHelper.addToolMaterial("rs_tool", 3, 7054, 10F, 8F, 20);
    static Item.ToolMaterial RS_WEAPON = EnumHelper.addToolMaterial("rs_weapon", 3, 7054, 7F, 12F, 20);
    static Item.ToolMaterial RS_AXE = EnumHelper.addToolMaterial("rs_axe", 3, 7054, 6F, 8F, 20);
    // Peridot and Topaz
    static Item.ToolMaterial PT_TOOL = EnumHelper.addToolMaterial("pt_tool", 3, 4186, 6F, 6F, 15);
    static Item.ToolMaterial PT_WEAPON = EnumHelper.addToolMaterial("pt_weapon", 3, 4186, 3F, 8F, 15);
    static Item.ToolMaterial PT_AXE = EnumHelper.addToolMaterial("pt_axe", 3, 4186, 6F, 7F, 15);
    // Hacker
    static Item.ToolMaterial HACKER = EnumHelper.addToolMaterial("hacker", 3, 32767, 9999F, 9999F, 20);
    // Armor
    static ItemArmor.ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("emerald_armor", "ultimategems:emerald_armor", 700, new int[]{3,4,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F);
    static ItemArmor.ArmorMaterial PALLADIUM = EnumHelper.addArmorMaterial("palladium_armor", "ultimategems:palladium_armor", 300, new int[]{2,3,4,2}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1F);
    static ItemArmor.ArmorMaterial TITANIUM = EnumHelper.addArmorMaterial("titanium_armor", "ultimategems:titanium_armor", 1500, new int[]{4,5,7,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
    static ItemArmor.ArmorMaterial RUBY = EnumHelper.addArmorMaterial("ruby_armor", "ultimategems:ruby_armor", 5835, new int[]{5,7,9,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7F);
    static ItemArmor.ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial("sapphire_armor", "ultimategems:sapphire_armor", 5835, new int[]{5,7,9,4}, 18,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7F);
}
