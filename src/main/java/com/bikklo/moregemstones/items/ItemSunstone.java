package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemSunstone extends Item {
	
	public ItemSunstone()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMSUNSTONE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMSUNSTONE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
