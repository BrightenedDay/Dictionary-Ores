package com.sabastian.dio.init;

import java.util.ArrayList;
import java.util.List;

import com.sabastian.dio.Main;
import com.sabastian.dio.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Ingot's
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", Main.modTab);
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot", Main.modTab);
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot", Main.modTab);
	public static final Item LAVASTONE_INGOT = new ItemBase("lavastone_ingot", Main.modTab);
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot", Main.modTab);
	public static final Item ALUMINIUM_INGOT = new ItemBase("aluminium_ingot", Main.modTab);
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot", Main.modTab);
	public static final Item TIN_INGOT = new ItemBase("tin_ingot", Main.modTab);
	public static final Item LUNITE_INGOT = new ItemBase("lunite_ingot", Main.modTab);
	public static final Item LITHIUM_INGOT = new ItemBase("lithium_ingot", Main.modTab);
	
	// Gems
	public static final Item RUBY = new ItemBase("ruby", Main.modTab);
	public static final Item SAPPHIRE_GEM = new ItemBase("sapphire_gem", Main.modTab);
	public static final Item TOPAZ_GEM = new ItemBase("topaz_gem", Main.modTab);
	public static final Item AMETHYST_GEM = new ItemBase("amethyst_gem", Main.modTab);
	public static final Item CRYSTAL = new ItemBase("crystal", Main.modTab);
}