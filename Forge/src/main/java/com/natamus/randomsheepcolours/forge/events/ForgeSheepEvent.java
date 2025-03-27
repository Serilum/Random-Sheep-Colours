package com.natamus.randomsheepcolours.forge.events;

import com.natamus.randomsheepcolours.events.SheepEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeSheepEvent {
	@SubscribeEvent
	public static void onSheepSpawn(EntityJoinLevelEvent e) {
		SheepEvent.onSheepSpawn(e.getLevel(), e.getEntity());
	}
}
