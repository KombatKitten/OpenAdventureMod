package com.github.KombatKitten.openAdventureMod;

import java.util.logging.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modID, name = Reference.name, version = Reference.version, acceptedMinecraftVersions = Reference.accepted_versions)
public class OpenAdventureMod {
	@SidedProxy(clientSide = "com.github.KombatKitten.openAdventureMod.ClientProxy", serverSide = "com.github.KombatKitten.openAdventureMod.CommonProxy")
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	
	@EventHandler
	public void init(FMLPreInitializationEvent e) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}

}
