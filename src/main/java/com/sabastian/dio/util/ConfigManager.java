package com.sabastian.dio.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ConfigManager {
	
	public static boolean canSpawnCopper;
	public static boolean canSpawnPlatinum;
	public static boolean canSpawnTungsten;
	public static boolean canSpawnHardstone;
	public static boolean canSpawnClayUnderground;
	public static boolean canSpawnRuby;
	public static boolean canSpawnSapphire;
	public static boolean canSpawnTopaz;
	public static boolean canSpawnAmethyst;
	public static boolean canSpawnLavastone;
	public static boolean canSpawnLead;
	public static boolean canSpawnXPore;
	public static boolean canSpawnXPoreInNether;
	public static boolean canSpawnAluminium;
	public static boolean canSpawnSilver;
	public static boolean canSpawnTin;
	public static boolean canSpawnCrystal;
	public static boolean canSpawnGlowstoneOre;
	public static boolean canSpawnUraniumOre;
	public static boolean canSpawnLuniteOre;
	public static boolean canSpawnLithiumOre;
	
	
	public static void ModConfig(FMLInitializationEvent event) {
		Configuration config = new Configuration(new File("config/dictionaryOres.cfg"));
		
		config.load();
		config.setCategoryComment("World Gen", "You can disable some ore spawns, if you dont need them.");
		
		canSpawnCopper = config.getBoolean("Generate Copper Ore", "World Gen", true, "");
		canSpawnPlatinum = config.getBoolean("Generate Platinum Ore", "World Gen", true, "");
		canSpawnTungsten = config.getBoolean("Generate Tungsten Ore", "World Gen", true, "");
		canSpawnHardstone = config.getBoolean("Generate Hardstone", "World Gen", true, "");
		canSpawnClayUnderground = config.getBoolean("Generate Clay Underground", "World Gen", true, "");
		canSpawnRuby = config.getBoolean("Generate Ruby Ore", "World Gen", true, "");
		canSpawnSapphire = config.getBoolean("Generate Sapphire Ore", "World Gen", true, "");
		canSpawnTopaz = config.getBoolean("Generate Topaz Ore", "World Gen", true, "");
		canSpawnAmethyst = config.getBoolean("Generate Amethyst Ore", "World Gen", true, "");
		canSpawnLavastone = config.getBoolean("Generate Lavastone", "World Gen", true, "");
		canSpawnLead = config.getBoolean("Generate Lead", "World Gen", true, "");
		canSpawnXPore = config.getBoolean("Generate XP Ore", "World Gen", true, "");
		canSpawnXPoreInNether = config.getBoolean("Generate XP Ore In The Nether", "World Gen", true, "");
		canSpawnAluminium = config.getBoolean("Generate Aluminum Ore", "World Gen", true, "");
		canSpawnSilver = config.getBoolean("Generate Silver Ore", "World Gen", true, "");
		canSpawnTin = config.getBoolean("Generate Tin Ore", "World Gen", true, "");
		canSpawnCrystal = config.getBoolean("Generate Crystal Clusters", "World Gen", true, "");
		canSpawnGlowstoneOre = config.getBoolean("Generate Glowstone Ore", "World Gen", true, "");
		canSpawnUraniumOre = config.getBoolean("Generate Uranium Ore", "World Gen", true, "");
		canSpawnLuniteOre = config.getBoolean("Generate Lunite Ore", "World Gen", true, "");
		canSpawnLithiumOre = config.getBoolean("Generate Lithium Ore", "World Gen", true, "");
		
		config.save();
	}
}