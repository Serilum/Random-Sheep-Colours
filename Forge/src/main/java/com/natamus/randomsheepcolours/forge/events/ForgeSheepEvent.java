package com.natamus.randomsheepcolours.forge.events;

import com.natamus.randomsheepcolours.events.SheepEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeSheepEvent {
	@SubscribeEvent
	public void onSheepSpawn(EntityJoinLevelEvent e) {
		SheepEvent.onSheepSpawn(e.getLevel(), e.getEntity());
	}
}
