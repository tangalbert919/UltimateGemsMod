package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.BlockHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class NetherIronOre extends ModBlock {
    public NetherIronOre(Material mat, String name, CreativeTabs tabs, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tabs, hardness, resistance, harvest, tool);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return new ItemBlock(BlockHandler.netheriron);
    }
}
