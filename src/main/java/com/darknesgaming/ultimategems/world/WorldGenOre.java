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
 * We will generate ores with this class. Don't modify unless adding new ores.
 */
public class WorldGenOre implements IWorldGenerator {
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
                break;
        }
    }
    private void genSurface(World world, Random rand, int chunkX, int chunkZ) {
        addOreSpawn(Blocks.EMERALD_ORE.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 25, 5, 30, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.palladiumore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 16, 30, 5, 60, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.titaniumore.getDefaultState(), world, rand, chunkX, chunkZ, 14, 14, 12, 25, 5, 40, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.rubyore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 8, 8, 5, 30, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.sapphireore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 8, 8, 5, 30, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.topazore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 18, 5, 50, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.peridotore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 18, 5, 50, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.amethystore.getDefaultState(), world, rand, chunkX, chunkZ, 14, 14, 8, 12, 5, 30, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.berylore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 18, 5, 50, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(BlockHandler.citrineore.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 18, 5, 50, BlockMatcher.forBlock(Blocks.STONE));
    }
    private void genNether(World world, Random rand, int chunkX, int chunkZ) {
        addOreSpawn(BlockHandler.netheriron.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 30, 10, 245, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }
    private void genEnd(World world, Random rand, int chunkX, int chunkZ) {
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
