package com.bikklo.moregemstones.init;

import com.bikklo.moregemstones.Reference;
import com.bikklo.moregemstones.blocks.BlockAmber;
import com.bikklo.moregemstones.blocks.BlockAmberOre;
import com.bikklo.moregemstones.blocks.BlockAmethyst;
import com.bikklo.moregemstones.blocks.BlockAmmolite;
import com.bikklo.moregemstones.blocks.BlockAquamarine;
import com.bikklo.moregemstones.blocks.BlockBloodstone;
import com.bikklo.moregemstones.blocks.BlockJade;
import com.bikklo.moregemstones.blocks.BlockMalachite;
import com.bikklo.moregemstones.blocks.BlockMoonstone;
import com.bikklo.moregemstones.blocks.BlockRuby;
import com.bikklo.moregemstones.blocks.BlockSapphire;
import com.bikklo.moregemstones.blocks.BlockSunstone;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block blockamber;
	public static Block blockamberore;
	public static Block blockamethyst;
	public static Block blockammolite;
	public static Block blockaquamarine;
	public static Block blockbloodstone;
	public static Block blockjade;
	public static Block blockmalachite;
	public static Block blockmoonstone;
	public static Block blockruby;
	public static Block blocksapphire;
	public static Block blocksunstone;
	
	public static void init()
	{
		blockamber = new BlockAmber();
		blockamberore = new BlockAmberOre();
		
		blockamethyst = new BlockAmethyst();
		
		blockammolite = new BlockAmmolite();
		
		blockaquamarine = new BlockAquamarine();
		
		blockbloodstone = new BlockBloodstone();
		
		blockjade = new BlockJade();
		
		blockmalachite = new BlockMalachite();
		
		blockmoonstone = new BlockMoonstone();
		
		blockruby = new BlockRuby();
		
		blocksapphire = new BlockSapphire();
		
		blocksunstone = new BlockSunstone();
		
	}
	
	public static void register()
	{
		registerBlock(blockamber);
		registerBlock(blockamberore);
		
		registerBlock(blockamethyst);
		
		registerBlock(blockammolite);
		
		registerBlock(blockaquamarine);
		
		registerBlock(blockbloodstone);
		
		registerBlock(blockjade);
		
		registerBlock(blockmalachite);
		
		registerBlock(blockmoonstone);
		
		registerBlock(blockruby);
		
		registerBlock(blocksapphire);
		
		registerBlock(blocksunstone);
		
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(blockamber);
		registerRender(blockamberore);
		
		registerRender(blockamethyst);
		
		registerRender(blockammolite);
		
		registerRender(blockaquamarine);
		
		registerRender(blockbloodstone);
		
		registerRender(blockjade);
		
		registerRender(blockmalachite);
		
		registerRender(blockmoonstone);
		
		registerRender(blockruby);
		
		registerRender(blocksapphire);
		
		registerRender(blocksunstone);
		
	}
	
	private static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory" ));
	}
}
