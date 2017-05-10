package com.darknesgaming.ultimategems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.Random;

/**
 * When making new blocks, please extend to this class file.
 * This is used to add new blocks to the game.
 */
public class ModBlock extends Block {
    public ModBlock(Material mat, String name, CreativeTabs tabs, float hardness, float resistance, int harvest, String tool) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvest);
    }
    // This constructor is only used for anything that either needs to tool or cannot be harvested.
    public ModBlock(Material mat, String name, CreativeTabs tabs, float hardness, float resistance) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        setHardness(hardness);
        setResistance(resistance);
    }
}
