package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMalachite extends Block {
	
	public BlockMalachite()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKMALACHITE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKMALACHITE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
