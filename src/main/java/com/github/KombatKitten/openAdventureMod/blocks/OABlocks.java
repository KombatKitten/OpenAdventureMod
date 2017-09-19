package com.github.KombatKitten.openAdventureMod.blocks;

import com.github.KombatKitten.openAdventureMod.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class OABlocks {
	private OABlocks() {
		
	}
	
	public static Block simpleBlock;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Block> e) {
		simpleBlock = new SimpleBlock();
		simpleBlock.setRegistryName(Reference.modID, "simpleblock");
		simpleBlock.setUnlocalizedName(simpleBlock.getRegistryName().toString());
		simpleBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		e.getRegistry().register(simpleBlock);
	}
}
