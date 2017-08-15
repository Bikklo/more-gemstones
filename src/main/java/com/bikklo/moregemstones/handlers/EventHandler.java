package com.bikklo.moregemstones.handlers;

import com.bikklo.moregemstones.events.BloodstoneSwordEvents;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
	
	public void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new BloodstoneSwordEvents());
	}

}
