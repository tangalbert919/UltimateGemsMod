package com.darknesgaming.ultimategems.items;

import net.minecraft.item.ItemAxe;

/**
 * The hacker's axe. Used by cheaters.
 * "You're just a dirty hacker, aren't you?" -Sans
 */
public class HackersAxe extends ItemAxe {
    public HackersAxe(String name, ToolMaterial material) {
        super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
