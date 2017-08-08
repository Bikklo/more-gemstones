package com.bikklo.moregemstones.proxy;

import com.bikklo.moregemstones.init.ModBlocks;
import com.bikklo.moregemstones.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
	
}
