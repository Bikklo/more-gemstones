package com.bikklo.moregemstones.world;

import java.util.Random;

import com.bikklo.moregemstones.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MoreGemstonesWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			this.runGenerator(this.gen_amber_ore, world, random, chunkX, chunkZ, 10, 0, 64);
			break;
		case -1: //Nether
			
			break;
		case 1: //End
			
			break;
		}
	}
	
	private WorldGenerator gen_amber_ore;
	
	public MoreGemstonesWorldGen()
	{
		this.gen_amber_ore = new WorldGenMinable(ModBlocks.blockamberore.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_x, int chunk_z, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Illegal Height Arguments for MoreGemstones WorldGenerator");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++ )
		{
			int x = chunk_x * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
