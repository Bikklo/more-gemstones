package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemAquamarine extends Item {

	public ItemAquamarine()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMAQUAMARINE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMAQUAMARINE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
	
}
