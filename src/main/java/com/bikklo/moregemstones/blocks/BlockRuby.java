package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {
	
	public BlockRuby()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKRUBY.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKRUBY.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
