package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOre extends ModBlock {
    public RubyOre(Material material, String name, CreativeTabs tabs, float hardness, float resistance, int harvest, String tool) {
        super(material, name, tabs, hardness, resistance, harvest, tool);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemHandler.ruby;
    }
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random rand) {
        return 1 + fortune;
    }
}
