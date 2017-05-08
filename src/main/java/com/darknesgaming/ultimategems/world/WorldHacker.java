package com.darknesgaming.ultimategems.world;

import com.darknesgaming.ultimategems.handlers.BlockHandler;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * The hacker's generator. Adored by cheaters, frowned on by everyone else.
 * This is not used by default.
 */
public class WorldHacker implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            case -1:
                this.genNether(world, random, chunkX, chunkZ);
                break;
            case 0:
                this.genSurface(world, random, chunkX, chunkZ);
                break;
            case 1:
                this.genEnd(world, random, chunkX, chunkZ);
                break;
            default:
                this.genSurface(world, random, chunkX, chunkZ);
        }
    }
    private void genSurface(World world, Random rand, int chunkX, int chunkZ) {
        // addOreSpawn(BlockHandler.block.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 24, 60, 10, 150, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.EMERALD_ORE.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 30, 80, 5, 125, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.palladiumore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 16, 30, 5, 125, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.titaniumore.getDefaultState(), world, rand, chunkX, chunkZ, 14, 14, 12, 25, 5, 125, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.DIAMOND_BLOCK.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 30, 75, 5, 150, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.IRON_BLOCK.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 40, 95, 5, 150, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.REDSTONE_BLOCK.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 45, 95, 5, 150, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.TNT.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 25, 5, 150, BlockMatcher.forBlock(Blocks.STONE));
    }
    private void genNether(World world, Random rand, int chunkX, int chunkZ) {
        addOreSpawn(BlockHandler.netheriron.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 40, 80, 5, 250, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }
    private void genEnd(World world, Random rand, int chunkX, int chunkZ) {
        addOreSpawn(Blocks.OBSIDIAN.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 40, 90, 5, 250, BlockMatcher.forBlock(Blocks.AIR));
    }
    private void addOreSpawn(IBlockState block, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
        int minMaxY = maxY - minY;
        for (int x = 0; x < chance; x++) {
            int posX = blockXPos * 16 + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(minMaxY);
            int posZ = blockZPos * 16 + rand.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, rand, new BlockPos(posX, posY, posZ));
        }
    }
}
