package com.bikklo.moregemstones.items;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.Item;

public class ItemRuby extends Item {
	
	public ItemRuby()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMRUBY.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMRUBY.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}

}
