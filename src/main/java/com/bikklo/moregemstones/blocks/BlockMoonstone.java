package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMoonstone extends Block {
	
	public BlockMoonstone()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKMOONSTONE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKMOONSTONE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);

		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(5.0F);
		this.setResistance(30.0F);
	}
}
