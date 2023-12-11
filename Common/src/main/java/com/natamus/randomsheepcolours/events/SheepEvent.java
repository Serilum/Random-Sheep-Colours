package com.natamus.randomsheepcolours.events;

import com.natamus.collective.data.GlobalVariables;
import com.natamus.randomsheepcolours.util.Reference;
import com.natamus.randomsheepcolours.util.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;

import java.util.Set;

public class SheepEvent {
	public static void onSheepSpawn(Level world, Entity entity) {
		if (world.isClientSide) {
			return;
		}
		
		if (!(entity instanceof Sheep)) {
			return;
		}
		
		String sheeptag = Reference.MOD_ID + ".coloured";
		Set<String> tags = entity.getTags();
		if (tags.contains(sheeptag)) {
			return;
		}
		
		if (Util.possibleColours == null) {
			return;
		}
		if (Util.possibleColours.size() < 1) {
			return;
		}
		
		Sheep sheep = (Sheep)entity;
		sheep.addTag(sheeptag);

		if (!sheep.getColor().equals(DyeColor.WHITE)) {
			return;
		}
		
		if (!((AgeableMob)entity).isBaby()) {
			int randomindex = GlobalVariables.random.nextInt(Util.possibleColours.size());
			final DyeColor randomcolour = Util.possibleColours.get(randomindex);
			
			if (!sheep.isAlive()) {
				return;
			}
			
			if (randomcolour == null) {
				sheep.setCustomName(new TextComponent("jeb_"));
				sheep.setCustomNameVisible(false);
			}
			else {
				sheep.setColor(randomcolour);
			}
		}
	}
}
