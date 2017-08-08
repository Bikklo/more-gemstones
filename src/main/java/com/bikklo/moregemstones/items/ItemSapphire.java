package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemSapphire extends Item {
	
	public ItemSapphire()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMSAPPHIRE.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMSAPPHIRE.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
}
