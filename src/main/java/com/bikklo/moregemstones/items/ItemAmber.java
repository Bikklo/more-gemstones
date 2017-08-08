package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemAmber extends Item {
	
	public ItemAmber()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMAMBER.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMAMBER.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
