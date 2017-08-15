package com.bikklo.moregemstones.tools;

import com.bikklo.moregemstones.MoreGemstonesMain;
import com.bikklo.moregemstones.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ToolAmberSword extends ItemSword {

	public ToolAmberSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MoreGemstonesTools.TOOLAMBERSWORD.getUnlocalizedName());
		setRegistryName(Reference.MoreGemstonesTools.TOOLAMBERSWORD.getRegistryName());
		setCreativeTab(MoreGemstonesMain.tabMoreGemstones);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		Vec3d playerLook = playerIn.getLook(2.0F);
		if(playerIn.isCollidedVertically == true) {
			playerIn.addVelocity(playerLook.xCoord * 1.2D, playerIn.motionY + 0.75D, playerLook.zCoord * 1.2D);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
}
