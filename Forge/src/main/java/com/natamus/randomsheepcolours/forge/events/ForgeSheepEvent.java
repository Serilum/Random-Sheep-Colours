package com.natamus.randomsheepcolours.forge.events;

import com.natamus.randomsheepcolours.events.SheepEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeSheepEvent {
	@SubscribeEvent
	public void onSheepSpawn(EntityJoinWorldEvent e) {
		SheepEvent.onSheepSpawn(e.getWorld(), e.getEntity());
	}
}
