package com.github.KombatKitten.openAdventureMod;

import com.github.KombatKitten.openAdventureMod.items.OAItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent e) {
		ModelResourceLocation location =
				new ModelResourceLocation(OAItems.simpleBlock.getRegistryName() + "_item_model");
		
		ModelLoader.setCustomModelResourceLocation(OAItems.simpleBlock, 0, location);
	}
}
