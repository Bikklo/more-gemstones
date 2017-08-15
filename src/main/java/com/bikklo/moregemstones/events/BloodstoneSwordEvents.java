package com.bikklo.moregemstones.events;

import java.util.Random;

import com.bikklo.moregemstones.init.ModItems;
import com.bikklo.moregemstones.init.ModTools;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BloodstoneSwordEvents {
	
	@SubscribeEvent
	public void onEvent(LivingHurtEvent event)
	{
		if(event.getSource().getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getSource().getEntity();
			if(player.getHeldItemMainhand().getItem() == ModTools.toolbloodstonesword) {
				BlockPos pos = event.getEntity().getPosition();
				EntityItem item = new EntityItem(player.getEntityWorld(), pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.itemdropofblood));
				Random rand = new Random();
				int chance = rand.nextInt(100) + 1;
				if(chance <= 10) {
					player.getEntityWorld().spawnEntity(item);
				}
			}
		}
	}
}
