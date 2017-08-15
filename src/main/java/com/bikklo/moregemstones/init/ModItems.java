package com.bikklo.moregemstones.init;

import com.bikklo.moregemstones.Reference;
import com.bikklo.moregemstones.items.ItemAmber;
import com.bikklo.moregemstones.items.ItemAmethyst;
import com.bikklo.moregemstones.items.ItemAmmolite;
import com.bikklo.moregemstones.items.ItemAquamarine;
import com.bikklo.moregemstones.items.ItemBloodstone;
import com.bikklo.moregemstones.items.ItemDropOfBlood;
import com.bikklo.moregemstones.items.ItemJade;
import com.bikklo.moregemstones.items.ItemMalachite;
import com.bikklo.moregemstones.items.ItemMoonstone;
import com.bikklo.moregemstones.items.ItemRuby;
import com.bikklo.moregemstones.items.ItemSapphire;
import com.bikklo.moregemstones.items.ItemSunstone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item itemamber;
	public static Item itemamethyst;
	public static Item itemammolite;
	public static Item itemaquamarine;
	public static Item itembloodstone;
	public static Item itemjade;
	public static Item itemmalachite;
	public static Item itemmoonstone;
	public static Item itemruby;
	public static Item itemsapphire;
	public static Item itemsunstone;
	
	public static Item itemdropofblood;
	
	public static void init()
	{
		itemamber = new ItemAmber();
		itemamethyst = new ItemAmethyst();
		itemammolite = new ItemAmmolite();
		itemaquamarine = new ItemAquamarine();
		itembloodstone = new ItemBloodstone();
		itemjade = new ItemJade();
		itemmalachite = new ItemMalachite();
		itemmoonstone = new ItemMoonstone();
		itemruby = new ItemRuby();
		itemsapphire = new ItemSapphire();
		itemsunstone = new ItemSunstone();
		
		itemdropofblood = new ItemDropOfBlood();
	}
	
	public static void register()
	{
		GameRegistry.register(itemamber);
		GameRegistry.register(itemamethyst);
		GameRegistry.register(itemammolite);
		GameRegistry.register(itemaquamarine);
		GameRegistry.register(itembloodstone);
		GameRegistry.register(itemjade);
		GameRegistry.register(itemmalachite);
		GameRegistry.register(itemmoonstone);
		GameRegistry.register(itemruby);
		GameRegistry.register(itemsapphire);
		GameRegistry.register(itemsunstone);
		
		GameRegistry.register(itemdropofblood);
	}
	
	public static void registerRenders()
	{
		registerRender(itemamber);
		registerRender(itemamethyst);
		registerRender(itemammolite);
		registerRender(itemaquamarine);
		registerRender(itembloodstone);
		registerRender(itemjade);
		registerRender(itemmalachite);
		registerRender(itemmoonstone);
		registerRender(itemruby);
		registerRender(itemsapphire);
		registerRender(itemsunstone);
		
		registerRender(itemdropofblood);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory" ));
	}
}
