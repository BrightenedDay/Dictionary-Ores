package com.sabastian.dio;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.sabastian.dio.proxy.CommonProxy;
import com.sabastian.dio.tabs.ModTab;
import com.sabastian.dio.util.ConfigManager;
import com.sabastian.dio.util.Reference;
import com.sabastian.dio.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs modTab = new ModTab("modTab");	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries();
		ConfigManager.ModConfig(event);
	}
	@EventHandler
	public void postIniy(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	}
}