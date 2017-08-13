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

public class BlockAmmoliteOre extends Block {
	
	public BlockAmmoliteOre()
	{
		super(Material.ROCK);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKAMMOLITEORE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKAMMOLITEORE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
		
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.itemammolite;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random)
	{
		return 1 + fortune;
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
}
