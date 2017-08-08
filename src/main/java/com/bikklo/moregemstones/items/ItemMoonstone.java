package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemMoonstone extends Item {
	
	public ItemMoonstone()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMMOONSTONE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMMOONSTONE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
