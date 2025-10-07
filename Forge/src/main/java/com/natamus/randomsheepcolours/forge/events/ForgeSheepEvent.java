package com.natamus.randomsheepcolours.forge.events;

import com.natamus.randomsheepcolours.events.SheepEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeSheepEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeSheepEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeSheepEvent::onSheepSpawn);
	}

	@SubscribeEvent
	public static void onSheepSpawn(EntityJoinLevelEvent e) {
		SheepEvent.onSheepSpawn(e.getLevel(), e.getEntity());
	}
}
