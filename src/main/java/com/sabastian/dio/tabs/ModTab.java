package com.sabastian.dio.tabs;

import com.sabastian.dio.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {
	
	public ModTab(String label) {
		super(label);
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.TOPAZ_ORE));
	}
}