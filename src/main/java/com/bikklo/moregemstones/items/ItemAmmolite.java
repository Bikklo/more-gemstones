package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemAmmolite extends Item {
	
	public ItemAmmolite()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMAMMOLITE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMAMMOLITE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
