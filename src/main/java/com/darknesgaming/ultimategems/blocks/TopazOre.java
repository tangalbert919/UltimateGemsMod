package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class TopazOre extends ModBlock {
    public TopazOre(Material material, String name, CreativeTabs tabs, float hardness, float resistance, int harvest, String tool) {
        super(material, name, tabs, hardness, resistance, harvest, tool);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemHandler.topaz;
    }
    public int quantityDropped(IBlockState state, int fortune, Random rand) {
        return 1 + fortune;
    }
}
