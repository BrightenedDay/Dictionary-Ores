package com.sabastian.dio.blocks;

import java.util.Random;

import com.sabastian.dio.Main;
import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.init.ItemInit;
import com.sabastian.dio.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	private Item itemDropped = null; // If null, then we wont change the drop.
	private boolean dropsAnything = true; // If false, then we dont drop anything.
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, float light, int lightOpacity) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setLightLevel(light);
		setLightOpacity(lightOpacity);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, float light, int lightOpacity, Item drop) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.itemDropped = drop;
		setHardness(hardness);
		setLightLevel(light);
		setLightOpacity(lightOpacity);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, float light) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setLightLevel(light);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, float light, Item drop) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.itemDropped = drop;
		setHardness(hardness);
		setLightLevel(light);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, boolean dropsAnything) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	public BlockBase(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, Item drop) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.itemDropped = drop;
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if(dropsAnything) {
			if(itemDropped != null) {
				return itemDropped;
			}
			return super.getItemDropped(state, rand, fortune);
		}
		return null;
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}