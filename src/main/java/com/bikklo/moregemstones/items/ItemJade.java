package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemJade extends Item {
	
	public ItemJade()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMJADE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMJADE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
