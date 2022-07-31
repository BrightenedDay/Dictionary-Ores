package com.sabastian.dio.recipes;

import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.PLATINUM_ORE), new ItemStack(ItemInit.PLATINUM_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.TUNGSTEN_ORE), new ItemStack(ItemInit.TUNGSTEN_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LAVASTONE_ORE), new ItemStack(ItemInit.LAVASTONE_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LEAD_ORE), new ItemStack(ItemInit.LEAD_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ALUMINIUM_ORE), new ItemStack(ItemInit.ALUMINIUM_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.SILVER_ORE), new ItemStack(ItemInit.SILVER_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.TIN_ORE), new ItemStack(ItemInit.TIN_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LUNITE_ORE), new ItemStack(ItemInit.LUNITE_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LITHIUM_ORE), new ItemStack(ItemInit.LITHIUM_INGOT), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.MAGICITE_ORE), new ItemStack(ItemInit.MAGICITE_DUST_TIER1), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemInit.MAGICITE_DUST_TIER1), new ItemStack(ItemInit.MAGICITE_INGOT_TIER1), 0.5F);
	}
}