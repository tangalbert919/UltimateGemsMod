package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BasicBlock extends ModBlock {
    public BasicBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemHandler.item;
    }
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random rand) {
        return rand.nextInt(5) + 1;
    }
}
