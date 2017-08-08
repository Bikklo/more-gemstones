package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemMalachite extends Item {
	
	public ItemMalachite()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMMALACHITE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMMALACHITE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}

}
