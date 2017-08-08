package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemAmethyst extends Item {

	public ItemAmethyst() 
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMAMETHYST.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMAMETHYST.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}