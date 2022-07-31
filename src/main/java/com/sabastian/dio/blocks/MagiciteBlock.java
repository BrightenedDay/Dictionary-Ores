package com.sabastian.dio.blocks;

import java.util.List;
import java.util.Random;

import com.sabastian.dio.Main;
import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.init.ItemInit;
import com.sabastian.dio.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MagiciteBlock extends Block implements IHasModel {
	
	int tierLevel = 1;
	
	public MagiciteBlock(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab, int tierLevel) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		this.tierLevel = tierLevel;
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00A77" + "Tier " + tierLevel);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}