package com.darknesgaming.ultimategems.blocks;

import com.darknesgaming.ultimategems.handlers.BlockHandler;
import com.darknesgaming.ultimategems.handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * This class is to add new ores to the game.
 * Only use this if the ores using this class don't give ores when mined.
 */
public class ModOre extends ModBlock {
    public ModOre(Material mat, String name, CreativeTabs tabs, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tabs, hardness, resistance, harvest, tool);
    }
    // Add the ores that use this class to the return statement in this method.
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == BlockHandler.rubyore ? ItemHandler.ruby : (this == BlockHandler.sapphireore ? ItemHandler.sapphire : (this == BlockHandler.topazore ? ItemHandler.topaz : (this == BlockHandler.peridotore ? ItemHandler.peridot : (this == BlockHandler.amethystore ? ItemHandler.amethyst : (this == BlockHandler.berylore ? ItemHandler.beryl : (this == BlockHandler.citrineore ? ItemHandler.citrine : Item.getItemFromBlock(this)))))));
    }
    // This method uses the fortune level. It comes directly from the BlockOre class.
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
}
