package com.bikklo.moregemstones.tools;

import java.util.List;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;

public class ToolBloodstoneSword extends ItemSword {
	
	public ToolBloodstoneSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MoreGemstonesTools.TOOLBLOODSTONESWORD.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesTools.TOOLBLOODSTONESWORD.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		String name = tooltip.get(0);
		name = TextFormatting.YELLOW + name;
		tooltip.set(0, name);
		tooltip.add(TextFormatting.DARK_RED + "Dripping with the blood of it's victims...");
	}
}
