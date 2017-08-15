package com.bikklo.moregemstones.proxy;

import com.bikklo.moregemstones.init.ModBlocks;
import com.bikklo.moregemstones.init.ModItems;
import com.bikklo.moregemstones.init.ModTools;

public class ClientProxy implements CommonProxy {

	@Override
	public void init()
	{
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
	}
	
	
}
