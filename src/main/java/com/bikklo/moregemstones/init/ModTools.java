package com.bikklo.moregemstones.init;

import com.bikklo.moregemstones.Reference;
import com.bikklo.moregemstones.tools.ToolAmberSword;
import com.bikklo.moregemstones.tools.ToolBloodstoneSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static ToolMaterial amberMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":amber", 2, 216, 5.5F, 2.25F, 12);
	public static ToolMaterial bloodstoneMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":bloodstone", 2, 532, 3.5F, 3.5F, 8);
	
	public static ItemSword toolambersword;
	public static ItemSword toolbloodstonesword;
	
	public static void init()
	{
		toolambersword = new ToolAmberSword(amberMaterial);
		toolbloodstonesword = new ToolBloodstoneSword(bloodstoneMaterial);
	}
	
	public static void register()
	{
		GameRegistry.register(toolambersword);
		GameRegistry.register(toolbloodstonesword);
	}
	
	public static void registerRenders()
	{
		registerRender(toolambersword);
		registerRender(toolbloodstonesword);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory" ));
	}
}
