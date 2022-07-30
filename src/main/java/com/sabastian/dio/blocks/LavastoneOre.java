package com.sabastian.dio.blocks;

import java.util.List;

import com.sabastian.dio.Main;
import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.init.ItemInit;
import com.sabastian.dio.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LavastoneOre extends Block implements IHasModel {
	
	public LavastoneOre(String name, Material material, float hardness, int miningLevel, String mineableTool, float resistance, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setLightLevel(5);
		setLightOpacity(0);
		setResistance(resistance);
		setHarvestLevel(mineableTool, miningLevel);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add("\u00A77" + "Years of volcanic activity have caused this mineral to form.");
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.STONE;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}