package com.sabastian.dio.world.gen;

import java.util.Random;

import com.sabastian.dio.init.BlockInit;
import com.sabastian.dio.util.ConfigManager;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator {
	
	private WorldGenerator overworld_copper;
	private WorldGenerator overworld_platinum;
	private WorldGenerator overworld_tungsten;
	private WorldGenerator hardstone;
	private WorldGenerator undergroundClayBlock;
	private WorldGenerator lead_ore;
	private WorldGenerator aluminium_ore;
	private WorldGenerator silver_ore;
	private WorldGenerator tin_ore;
	private WorldGenerator uranium_ore;
	private WorldGenerator lunite_ore;
	private WorldGenerator lithium_ore;
	private WorldGenerator magicite_ore;
	
	// Gem Types
	private WorldGenerator ruby_ore;
	private WorldGenerator sapphire_ore;
	private WorldGenerator topaz_ore;
	private WorldGenerator amethyst_ore;
	
	
	public WorldGenCustomOres() {
		overworld_copper = new WorldGenMinable(BlockInit.COPPER_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		overworld_platinum = new WorldGenMinable(BlockInit.PLATINUM_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		overworld_tungsten = new WorldGenMinable(BlockInit.TUNGSTEN_ORE.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
		hardstone = new WorldGenMinable(BlockInit.HARDSTONE.getDefaultState(), 35, BlockMatcher.forBlock(Blocks.STONE));
		undergroundClayBlock = new WorldGenMinable(Blocks.CLAY.getDefaultState(), 16, BlockMatcher.forBlock(Blocks.STONE));
		lead_ore = new WorldGenMinable(BlockInit.LEAD_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		aluminium_ore = new WorldGenMinable(BlockInit.ALUMINIUM_ORE.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
		silver_ore = new WorldGenMinable(BlockInit.SILVER_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		tin_ore = new WorldGenMinable(BlockInit.TIN_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		uranium_ore = new WorldGenMinable(BlockInit.URANIUM_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		lunite_ore = new WorldGenMinable(BlockInit.LUNITE_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		lithium_ore = new WorldGenMinable(BlockInit.LITHIUM_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		magicite_ore = new WorldGenMinable(BlockInit.MAGICITE_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.END_STONE));
		
		// Gem Types
		ruby_ore = new WorldGenMinable(BlockInit.RUBY_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		sapphire_ore = new WorldGenMinable(BlockInit.SAPPHIRE_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		topaz_ore = new WorldGenMinable(BlockInit.TOPAZ_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		amethyst_ore = new WorldGenMinable(BlockInit.AMETHYST_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1: // Nether
			if(ConfigManager.canSpawnXPoreInNether)
				generateCertainOre(BlockInit.XP_ORE_NETHER, world, random, chunkX * 16, chunkZ * 16, 0, 40, 3, 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
			
			break;
		case 0: // Overworld
			if(ConfigManager.canSpawnCopper)
				runGenerator(overworld_copper, random, world, chunkX, chunkZ, 50, 0, world.getHeight());
			if(ConfigManager.canSpawnPlatinum)
				runGenerator(overworld_platinum, random, world, chunkX, chunkZ, 3, 0, 40);
			if(ConfigManager.canSpawnTungsten)
				runGenerator(overworld_tungsten, random, world, chunkX, chunkZ, 11, 0, 20);
			if(ConfigManager.canSpawnHardstone)
				runGenerator(hardstone, random, world, chunkX, chunkZ, 79, 0, world.getActualHeight());
			if(ConfigManager.canSpawnClayUnderground)
				runGenerator(undergroundClayBlock, random, world, chunkX, chunkZ, 65, 0, world.getHeight());
			if(ConfigManager.canSpawnLavastone)
				generateCertainOre(BlockInit.LAVASTONE_ORE, world, random, chunkX * 16, chunkZ * 16, 0, 20, 3, 8, BlockMatcher.forBlock(Blocks.STONE));
			
			
			// Gem Types
			if(ConfigManager.canSpawnRuby)
				runGenerator(ruby_ore, random, world, chunkX, chunkZ, 2, 0, 40);
			if(ConfigManager.canSpawnSapphire)
				runGenerator(sapphire_ore, random, world, chunkX, chunkZ, 2, 0, 40);
			if(ConfigManager.canSpawnTopaz)
				runGenerator(topaz_ore, random, world, chunkX, chunkZ, 2, 0, 40);
			if(ConfigManager.canSpawnAmethyst)
				runGenerator(amethyst_ore, random, world, chunkX, chunkZ, 2, 0, 40);
			
			
			if(ConfigManager.canSpawnLead)
				runGenerator(lead_ore, random, world, chunkX, chunkZ, 15, 0, 50);
			
			if(ConfigManager.canSpawnAluminium)
				runGenerator(aluminium_ore, random, world, chunkX, chunkZ, 20, 0, 50);
			
			if(ConfigManager.canSpawnSilver)
				runGenerator(silver_ore, random, world, chunkX, chunkZ, 35, 0, 50);
			
			if(ConfigManager.canSpawnTin)
				runGenerator(tin_ore, random, world, chunkX, chunkZ, 40, 0, world.getHeight());
			
			
			if(ConfigManager.canSpawnXPore)
				generateCertainOre(BlockInit.XP_ORE, world, random, chunkX * 16, chunkZ * 16, 0, 40, 3, 8, BlockMatcher.forBlock(Blocks.STONE));
			
			
			if(ConfigManager.canSpawnCrystal) {
				generateCrystalCluster(BlockInit.CRYSTAL_BLOCK, world, random, chunkX * 16, chunkZ * 16, 0, 30, 3, 18, BlockMatcher.forBlock(Blocks.STONE));
			}
			
			
			if(ConfigManager.canSpawnGlowstoneOre)
				generateCertainOre(BlockInit.GLOWSTONE_ORE, world, random, chunkX * 16, chunkZ * 16, 0, 40, 5, 15, BlockMatcher.forBlock(Blocks.STONE));
			
			if(ConfigManager.canSpawnUraniumOre)
				runGenerator(uranium_ore, random, world, chunkX, chunkZ, 5, 0, 30);
			
			if(ConfigManager.canSpawnLuniteOre)
				runGenerator(lunite_ore, random, world, chunkX, chunkZ, 3, 0, 12);
			
			if(ConfigManager.canSpawnLithiumOre)
				runGenerator(lithium_ore, random, world, chunkX, chunkZ, 19, 0, 40);
			
			break;
		case 1: // The End
			if(ConfigManager.canSpawnMagiciteOre)
				runGenerator(magicite_ore, random, world, chunkX, chunkZ, 8, 0, world.getHeight());
			break;
		}
	}
	
	private  void runGenerator(WorldGenerator gen, Random rand, World world, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Remapping Ore Generation");
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for	(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
	
	
    private void generateCertainOre(Block ore, World world, Random rand, int chunkX, int chunkZ, int minY, int maxY, int size, int spawnTries, BlockMatcher block) {
        int deltaY = maxY - minY + 1;
        if (minY < 0) minY = 1;
        if (maxY > 255) maxY = 255;

        for (int i = 0; i < spawnTries; i++) {
            BlockPos pos = new BlockPos(chunkX + rand.nextInt(16), minY + rand.nextInt(deltaY), chunkZ + rand.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore.getDefaultState(), size, block);
            generator.generate(world, rand, pos);
        }
    }
    
    private void generateCrystalCluster(Block ore, World world, Random rand, int chunkX, int chunkZ, int minY, int maxY, int size, int spawnTries, BlockMatcher block) {
        int deltaY = maxY - minY + 1;
        if (minY < 0) minY = 1;
        if (maxY > 255) maxY = 255;

        for (int i = 0; i < spawnTries; i++) {
            BlockPos pos = new BlockPos(chunkX + rand.nextInt(16), minY + rand.nextInt(deltaY), chunkZ + rand.nextInt(16));
            BlockPos pos1 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
            BlockPos pos2 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
            if(world.getBlockState(pos1).getBlock() == Blocks.STONE && world.getBlockState(pos2).getBlock() != BlockInit.CRYSTAL_BLOCK) {
	            WorldGenMinable generator = new WorldGenMinable(ore.getDefaultState(), size, block);
	            generator.generate(world, rand, pos);
            }
        }
    }
}