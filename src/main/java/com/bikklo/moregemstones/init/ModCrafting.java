package com.bikklo.moregemstones.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register()
	{
		//Amber
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockamber), "AAA", "AAA", "AAA", 'A', ModItems.itemamber );
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemamber, 9), ModBlocks.blockamber);
		//Amethyst
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockamethyst), "AAA", "AAA", "AAA", 'A', ModItems.itemamethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemamethyst, 9), ModBlocks.blockamethyst);
		//Ammolite
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockammolite), "AAA", "AAA", "AAA", 'A', ModItems.itemammolite);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemammolite, 9), ModBlocks.blockammolite);
		//Aquamarine
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockaquamarine), "AAA", "AAA", "AAA", 'A', ModItems.itemaquamarine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemaquamarine, 9), ModBlocks.blockaquamarine);
		//Bloodstone
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockbloodstone), "BBB", "BBB", "BBB", 'B', ModItems.itembloodstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itembloodstone, 9), ModBlocks.blockbloodstone);
		//Jade
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockjade), "JJJ", "JJJ", "JJJ", 'J', ModItems.itemjade);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemjade, 9), ModBlocks.blockjade);
		//Malachite
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockmalachite), "MMM", "MMM", "MMM", 'M', ModItems.itemmalachite);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemmalachite, 9), ModBlocks.blockmalachite);
		//Moonstone
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockmoonstone), "MMM", "MMM", "MMM", 'M', ModItems.itemmoonstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemmoonstone, 9), ModBlocks.blockmoonstone);
		//Ruby
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockruby), "RRR", "RRR", "RRR", 'R', ModItems.itemruby);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemruby, 9), ModBlocks.blockruby);
		//Sapphire
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blocksapphire), "SSS", "SSS", "SSS", 'S', ModItems.itemsapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemsapphire, 9), ModBlocks.blocksapphire);
		//Sunstone
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blocksunstone), "SSS", "SSS", "SSS", 'S', ModItems.itemsunstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemsunstone, 9), ModBlocks.blocksunstone);
	}
}
