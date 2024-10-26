package com.natamus.randomsheepcolours;

import com.natamus.randomsheepcolours.config.ConfigHandler;
import com.natamus.randomsheepcolours.util.Util;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		Util.initColours();
	}
}