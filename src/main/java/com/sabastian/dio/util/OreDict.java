package com.sabastian.dio.util;

import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.init.ItemInit;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	
	public static void registerDictionary() {
		OreDictionary.registerOre("blockHardstone", BlockInit.HARDSTONE);
		
		OreDictionary.registerOre("oreCopper", BlockInit.COPPER_ORE);
		OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
		OreDictionary.registerOre("blockCopper", BlockInit.COPPER_BLOCK);
		
		OreDictionary.registerOre("orePlatinum", BlockInit.PLATINUM_ORE);
		OreDictionary.registerOre("ingotPlatinum", ItemInit.PLATINUM_INGOT);
		OreDictionary.registerOre("blockPlatinum", BlockInit.PLATINUM_BLOCK);
		
		OreDictionary.registerOre("oreTungsten", BlockInit.TUNGSTEN_ORE);
		OreDictionary.registerOre("ingotTungsten", ItemInit.TUNGSTEN_INGOT);
		OreDictionary.registerOre("blockTungsten", BlockInit.TUNGSTEN_BLOCK);
		
		OreDictionary.registerOre("oreAluminum", BlockInit.ALUMINIUM_ORE);
		OreDictionary.registerOre("ingotAluminum", ItemInit.ALUMINIUM_INGOT);
		OreDictionary.registerOre("blockAluminum", BlockInit.ALUMINIUM_BLOCK);
		
		// Gem Types
		OreDictionary.registerOre("oreRuby", BlockInit.RUBY_ORE);
		OreDictionary.registerOre("oreSapphire", BlockInit.SAPPHIRE_ORE);
		OreDictionary.registerOre("oreTopaz", BlockInit.TOPAZ_ORE);
		OreDictionary.registerOre("oreAmethyst", BlockInit.AMETHYST_ORE);
		
		OreDictionary.registerOre("gemRuby", ItemInit.RUBY);
		OreDictionary.registerOre("gemSapphire", ItemInit.SAPPHIRE_GEM);
		OreDictionary.registerOre("gemTopaz", ItemInit.TOPAZ_GEM);
		OreDictionary.registerOre("gemAmethyst", ItemInit.AMETHYST_GEM);
		
		OreDictionary.registerOre("blockRuby", BlockInit.RUBY_BLOCK);
		OreDictionary.registerOre("blockSapphire", BlockInit.SAPPHIRE_GEM_BLOCK);
		OreDictionary.registerOre("blockTopaz", BlockInit.TOPAZ_GEM_BLOCK);
		OreDictionary.registerOre("blockAmethyst", BlockInit.AMETHYST_GEM_BLOCK);
		
		
		
		OreDictionary.registerOre("oreLavastone", BlockInit.LAVASTONE_ORE);
		OreDictionary.registerOre("ingotLavastone", ItemInit.LAVASTONE_INGOT);
		OreDictionary.registerOre("blockLavastone", BlockInit.LAVASTONE_BLOCK);
		
		
		OreDictionary.registerOre("oreLead", BlockInit.LEAD_ORE);
		OreDictionary.registerOre("ingotLead", ItemInit.LEAD_INGOT);
		OreDictionary.registerOre("blockLead", BlockInit.LEAD_BLOCK);
		
		OreDictionary.registerOre("oreXP", BlockInit.XP_ORE);
		OreDictionary.registerOre("oreNetherrackXP", BlockInit.XP_ORE_NETHER);
		
		OreDictionary.registerOre("oreSilver", BlockInit.SILVER_ORE);
		OreDictionary.registerOre("ingotSilver", ItemInit.SILVER_INGOT);
		OreDictionary.registerOre("blockSilver", BlockInit.SILVER_BLOCK);
		
		OreDictionary.registerOre("oreTin", BlockInit.TIN_ORE);
		OreDictionary.registerOre("ingotTin", ItemInit.TIN_INGOT);
		OreDictionary.registerOre("blockTin", BlockInit.TIN_BLOCK);
		
		OreDictionary.registerOre("oreCrystal", BlockInit.CRYSTAL_BLOCK);
		OreDictionary.registerOre("gemCrystal", ItemInit.CRYSTAL);
		
		OreDictionary.registerOre("oreUranium", BlockInit.CRYSTAL_BLOCK);
		
		OreDictionary.registerOre("oreGlowstone", BlockInit.GLOWSTONE_ORE);
		
		OreDictionary.registerOre("oreLunite", BlockInit.LUNITE_ORE);
		OreDictionary.registerOre("ingotLunite", ItemInit.LUNITE_INGOT);
		OreDictionary.registerOre("blockLunite", BlockInit.LUNITE_BLOCK);
		
		OreDictionary.registerOre("oreLithium", BlockInit.LITHIUM_ORE);
		OreDictionary.registerOre("ingotLithium", ItemInit.LITHIUM_INGOT);
		OreDictionary.registerOre("blockLithium", BlockInit.LITHIUM_BLOCK);
	}
}