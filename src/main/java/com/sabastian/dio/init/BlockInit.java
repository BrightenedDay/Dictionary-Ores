package com.sabastian.dio.init;

import java.util.ArrayList;
import java.util.List;

import com.sabastian.dio.Main;
import com.sabastian.dio.blocks.BlockBase;
import com.sabastian.dio.blocks.CrystalBlock;
import com.sabastian.dio.blocks.GlowstoneOre;
import com.sabastian.dio.blocks.LavastoneOre;
import com.sabastian.dio.blocks.MagiciteBlock;
import com.sabastian.dio.blocks.XPOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockInit {
	
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	// Regs
	public static final Block HARDSTONE = new BlockBase("hardstone", Material.ROCK, 4, 1, "pickaxe", 6, Main.modTab, Item.getItemFromBlock(Blocks.COBBLESTONE));
	
	// Ores
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, 3, 1, "pickaxe", 4, Main.modTab);
	public static final Block PLATINUM_ORE = new BlockBase("platinum_ore", Material.ROCK, 4.5F, 2, "pickaxe", 14, Main.modTab);
	public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.ROCK, 4.5F, 3, "pickaxe", 15, Main.modTab);
	
	// Full Ore Blocks
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 3, 2, "pickaxe", 5, Main.modTab);
	public static final Block PLATINUM_BLOCK = new BlockBase("platinum_block", Material.IRON, 3.3F, 2, "pickaxe", 8, Main.modTab);
	public static final Block TUNGSTEN_BLOCK = new BlockBase("tungsten_block", Material.IRON, 4.4F, 2, "pickaxe", 28, Main.modTab);
	
	// Gems
	public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK, 3f, 2, "pickaxe", 5, Main.modTab, ItemInit.RUBY);
	public static final Block SAPPHIRE_ORE = new BlockBase("sapphire_ore", Material.ROCK, 3f, 2, "pickaxe", 5, Main.modTab, ItemInit.SAPPHIRE_GEM);
	public static final Block TOPAZ_ORE = new BlockBase("topaz_ore", Material.ROCK, 3f, 2, "pickaxe", 5, Main.modTab, ItemInit.TOPAZ_GEM);
	public static final Block AMETHYST_ORE = new BlockBase("amethyst_ore", Material.ROCK, 3f, 2, "pickaxe", 5, Main.modTab, ItemInit.AMETHYST_GEM);
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.ROCK, 3f, 2, "pickaxe", 7, Main.modTab);
	public static final Block SAPPHIRE_GEM_BLOCK = new BlockBase("sapphire_gem_block", Material.ROCK, 3f, 2, "pickaxe", 7, Main.modTab);
	public static final Block TOPAZ_GEM_BLOCK = new BlockBase("topaz_gem_block", Material.ROCK, 3f, 2, "pickaxe", 7, Main.modTab);
	public static final Block AMETHYST_GEM_BLOCK = new BlockBase("amethyst_gem_block", Material.ROCK, 3f, 2, "pickaxe", 7, Main.modTab);
	
	
	
	public static final Block LAVASTONE_ORE = new LavastoneOre("lavastone_ore", Material.ROCK, 40F, 3, "pickaxe", 7, Main.modTab);
	public static final Block LAVASTONE_BLOCK = new BlockBase("lavastone_block", Material.ANVIL, 30f, 3, "pickaxe", 45, Main.modTab);
	
	public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK, 4.5F, 2, "pickaxe", 12, Main.modTab);
	public static final Block LEAD_BLOCK = new BlockBase("lead_block", Material.IRON, 5f, 2, "pickaxe", 16, Main.modTab);
	
	
	public static final Block XP_ORE = new XPOre("xp_ore", Material.ROCK, 4.5F, 2, "pickaxe", 7, Main.modTab);
	public static final Block XP_ORE_NETHER = new XPOre("netherrack_xp_ore", Material.ROCK, 4F, 2, "pickaxe", 5, Main.modTab);
	
	public static final Block ALUMINIUM_ORE = new BlockBase("aluminium_ore", Material.ROCK, 3.3F, 2, "pickaxe", 10, Main.modTab);
	public static final Block ALUMINIUM_BLOCK = new BlockBase("aluminium_block", Material.IRON, 5f, 2, "pickaxe", 13, Main.modTab);
	
	public static final Block SILVER_ORE = new BlockBase("silver_ore", Material.ROCK, 3.3F, 2, "pickaxe", 10, Main.modTab);
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON, 5f, 2, "pickaxe", 13, Main.modTab);
	
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK, 3.3F, 1, "pickaxe", 3, Main.modTab);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON, 5f, 2, "pickaxe", 4, Main.modTab);
	
	public static final Block CRYSTAL_BLOCK = new CrystalBlock("crystal_cluster", Material.ROCK, 3.3F, 2, "pickaxe", 2, Main.modTab);
	
	public static final Block GLOWSTONE_ORE = new GlowstoneOre("glowstone_ore", Material.ROCK, 1.3f, 0.3f, Main.modTab);
	
	public static final Block URANIUM_ORE = new BlockBase("uranium_ore", Material.ROCK, 3.3F, 2, "pickaxe", 5, Main.modTab);
	
	public static final Block LUNITE_ORE = new BlockBase("lunite_ore", Material.ROCK, 4F, 3, "pickaxe", 8, Main.modTab);
	public static final Block LUNITE_BLOCK = new BlockBase("lunite_block", Material.IRON, 5f, 3, "pickaxe", 10, Main.modTab);
	
	public static final Block LITHIUM_ORE = new BlockBase("lithium_ore", Material.ROCK, 1F, 2, "pickaxe", 5, Main.modTab);
	public static final Block LITHIUM_BLOCK = new BlockBase("lithium_block", Material.IRON, 4f, 2, "pickaxe", 7, Main.modTab);
	
	public static final Block MAGICITE_ORE = new BlockBase("magicite_ore", Material.ROCK, 4.3F, 2, "pickaxe", 10, Main.modTab);
	public static final Block MAGICITE_BLOCK_TIER1 = new MagiciteBlock("magicite_block_tier1", Material.IRON, 4.8F, 2, "pickaxe", 10, Main.modTab, 1);
}