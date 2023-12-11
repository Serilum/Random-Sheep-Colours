package com.natamus.randomsheepcolours.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.randomsheepcolours.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static String possibleSheepColours = "black,blue,brown,cyan,gray,green,jeb,light_blue,light_gray,lime,magenta,orange,pink,purple,red,white,yellow";

	public static void initConfig() {
		configMetaData.put("possibleSheepColours", Arrays.asList(
			"The possible sheep colours which the mod chooses from, divided by a comma."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}