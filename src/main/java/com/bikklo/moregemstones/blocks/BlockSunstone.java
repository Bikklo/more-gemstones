package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSunstone extends Block {
	
	public BlockSunstone()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKSUNSTONE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKSUNSTONE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
		
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(5.0F);
		this.setResistance(30.0F);
	}
}
