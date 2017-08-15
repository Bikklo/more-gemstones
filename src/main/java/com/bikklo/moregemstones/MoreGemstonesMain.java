package com.bikklo.moregemstones;

import com.bikklo.moregemstones.init.ModBlocks;
import com.bikklo.moregemstones.init.ModCrafting;
import com.bikklo.moregemstones.init.ModItems;
import com.bikklo.moregemstones.init.ModTools;
import com.bikklo.moregemstones.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MoreGemstonesMain {
	
	com.bikklo.moregemstones.handlers.EventHandler eventHandler = new com.bikklo.moregemstones.handlers.EventHandler();
	
	@Instance
	public static MoreGemstonesMain instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModItems.register();
		ModTools.init();
		ModTools.register();
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		
		ModCrafting.register();
		eventHandler.registerEvents();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabMoreGemstones = new CreativeTabs("tab_moregemstones")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.itemaquamarine);
		}
	};
}