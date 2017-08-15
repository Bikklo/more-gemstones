package com.bikklo.moregemstones.tools;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.item.ItemSword;

public class ToolAmberSword extends ItemSword {

	public ToolAmberSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MoreGemstonesTools.TOOLAMBERSWORD.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesTools.TOOLAMBERSWORD.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
	
}
