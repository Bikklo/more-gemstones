package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockJade extends Block {
	
	public BlockJade()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKJADE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKJADE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
