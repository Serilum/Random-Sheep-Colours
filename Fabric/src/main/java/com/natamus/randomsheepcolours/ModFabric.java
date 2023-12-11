package com.natamus.randomsheepcolours;

import com.natamus.collective.check.RegisterMod;
import com.natamus.randomsheepcolours.events.SheepEvent;
import com.natamus.randomsheepcolours.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		ServerEntityEvents.ENTITY_LOAD.register((Entity entity, ServerLevel world) -> {
			SheepEvent.onSheepSpawn(world, entity);
		});
	}

	private static void setGlobalConstants() {

	}
}
