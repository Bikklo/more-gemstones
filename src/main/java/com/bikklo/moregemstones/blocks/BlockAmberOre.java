package com.bikklo.moregemstones.blocks;

import java.util.Random;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;
import com.bikklo.moregemstones.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAmberOre extends Block {
	
	private int min_drop = 1;
	private int max_drop = 2;
	
	public BlockAmberOre()
	{
		super(Material.ROCK);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKAMBERORE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKAMBERORE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
		
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0f);
		this.setResistance(15.0f);
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		return 2 + fortune;
	}
	
	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		return true;
	}
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune)
	{
		return ModItems.itemamber;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random)
	{
			return this.min_drop + random.nextInt(this.max_drop - this.min_drop + fortune + 1);
	}
}
