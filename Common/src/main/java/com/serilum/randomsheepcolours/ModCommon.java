package com.serilum.randomsheepcolours;

import com.serilum.randomsheepcolours.config.ConfigHandler;
import com.serilum.randomsheepcolours.util.Util;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		Util.initColours();
	}
}