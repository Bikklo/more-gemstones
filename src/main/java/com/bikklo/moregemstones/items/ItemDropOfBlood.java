package com.bikklo.moregemstones.items;

import java.util.List;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemDropOfBlood extends Item {
	
	public ItemDropOfBlood()
	{
		setUnlocalizedName(Reference.MoreGemstonesItems.ITEMDROPOFBLOOD.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesItems.ITEMDROPOFBLOOD.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if(playerIn.getHealth() < playerIn.getMaxHealth()) {
			playerIn.heal(2.0F);
			playerIn.playSound(new SoundEvent(new ResourceLocation("minecraft:entity.generic.drink")), 0.5F, 1.0F);
			playerIn.getHeldItem(handIn).shrink(1);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		String name = tooltip.get(0);
		name =  TextFormatting.YELLOW + name;
		tooltip.set(0, name);
		tooltip.add(TextFormatting.DARK_RED + "A drop of the victim's blood...");
	}
}
