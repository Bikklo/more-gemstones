package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemBloodstone extends Item {
	
	public ItemBloodstone()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMBLOODSTONE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMBLOODSTONE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
