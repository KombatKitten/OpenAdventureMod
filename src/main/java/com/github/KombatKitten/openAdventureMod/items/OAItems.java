package com.github.KombatKitten.openAdventureMod.items;

import com.github.KombatKitten.openAdventureMod.blocks.OABlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class OAItems {
	private OAItems() {
		
	}
	
	public static Item simpleBlock;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		simpleBlock = new ItemBlock(OABlocks.simpleBlock);
		simpleBlock.setRegistryName(OABlocks.simpleBlock.getRegistryName());
		simpleBlock.setUnlocalizedName(simpleBlock.getRegistryName().toString());
		simpleBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		e.getRegistry().register(simpleBlock);
	}
}
