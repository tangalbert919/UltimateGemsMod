package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.BlockHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;
// TODO: Make this smeltable in Tinkers' Construct
public class TitaniumOre extends ModBlock {
    public TitaniumOre(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return new ItemBlock(BlockHandler.titaniumore);
    }
}
