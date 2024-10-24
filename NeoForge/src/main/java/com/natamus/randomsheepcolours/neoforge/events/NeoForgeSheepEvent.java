package com.natamus.randomsheepcolours.neoforge.events;

import com.natamus.randomsheepcolours.events.SheepEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeSheepEvent {
	@SubscribeEvent
	public static void onSheepSpawn(EntityJoinLevelEvent e) {
		SheepEvent.onSheepSpawn(e.getLevel(), e.getEntity());
	}
}
