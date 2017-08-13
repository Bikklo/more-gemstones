package com.bikklo.moregemstones;

public class Reference {

	public static final String MOD_ID = "moregemstones";
	public static final String NAME = "More Gemstones";
	public static final String VERSION = "0.1-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.bikklo.moregemstones.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.bikklo.moregemstones.proxy.ServerProxy";
	
	public static enum MoreGemstonesItems
	{
		ITEMAMBER("itemamber", "ItemAmber"),
		ITEMAMETHYST("itemamethyst", "ItemAmethyst"),
		ITEMAMMOLITE("itemammolite", "ItemAmmolite"),
		ITEMAQUAMARINE("itemaquamarine", "ItemAquamarine"),
		ITEMBLOODSTONE("itembloodstone", "ItemBloodstone"),
		ITEMJADE("itemjade", "ItemJade"),
		ITEMMALACHITE("itemmalachite", "ItemMalachite"),
		ITEMMOONSTONE("itemmoonstone", "ItemMoonstone"),
		ITEMRUBY("itemruby", "ItemRuby"),
		ITEMSAPPHIRE("itemsapphire", "ItemSapphire"),
		ITEMSUNSTONE("itemsunstone", "ItemSunstone");
		
		private String unlocalizedName;
		private String registryName;
		
		MoreGemstonesItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	
	public static enum MoreGemstonesBlocks
	{
		BLOCKAMBER("blockamber", "BlockAmber"),
		BLOCKAMBERORE("blockamberore", "BlockAmberOre"),
		BLOCKAMETHYST("blockamethyst", "BlockAmethyst"),
		BLOCKAMETHYSTORE("blockamethystore", "BlockAmethystOre"),
		BLOCKAMMOLITE("blockammolite", "BlockAmmolite"),
		BLOCKAMMOLITEORE("blockammoliteore", "BlockAmmoliteOre"),
		BLOCKAQUAMARINE("blockaquamarine", "BlockAquamarine"),
		BLOCKAQUAMARINEORE("blockaquamarineore", "BlockAquamarineOre"),
		BLOCKBLOODSTONE("blockbloodstone", "BlockBloodstone"),
		BLOCKJADE("blockjade", "BlockJade"),
		BLOCKMALACHITE("blockmalachite", "BlockMalachite"),
		BLOCKMOONSTONE("blockmoonstone", "BlockMoonstone"),
		BLOCKRUBY("blockruby", "BlockRuby"),
		BLOCKSAPPHIRE("blocksapphire", "BlockSapphire"),
		BLOCKSUNSTONE("blocksunstone", "BlockSunstone");
		
		private String unlocalizedName;
		private String registryName;
		
		MoreGemstonesBlocks(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
}
