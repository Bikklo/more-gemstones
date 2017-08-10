package com.bikklo.moregemstones.blocks;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAmber extends Block {
	
	public BlockAmber()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.MoreGemstonesBlocks.BLOCKAMBER.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesBlocks.BLOCKAMBER.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
		
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(5.0F);
		this.setResistance(30.0F);
	}
}
