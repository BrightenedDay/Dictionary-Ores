package com.sabastian.dio.util;

import net.minecraft.util.ResourceLocation;

public class Reference {
	
	public static final String MODID = "dio";
	public static final String NAME = "Dictionary Ores";
	public static final String VERSION = "2.2";
	
	public static final String CLIENT = "com.sabastian.dio.proxy.ClientProxy";
	public static final String COMMON = "com.sabastian.dio.proxy.CommonProxy";
	
	
	public static ResourceLocation getLocation( String register ) {
		return new ResourceLocation( Reference.MODID, register );
	}
}