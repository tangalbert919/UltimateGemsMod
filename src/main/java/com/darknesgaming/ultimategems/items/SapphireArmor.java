package com.darknesgaming.ultimategems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Sapphire Armor increases defense power. Wear the full suit to maximize resistance.
 */

public class SapphireArmor extends ModArmor {
    public SapphireArmor(String name, ArmorMaterial material, CreativeTabs tab, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(name, material, tab, renderIndexIn, equipmentSlotIn);
    }
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 999999, 2));
    }
}
