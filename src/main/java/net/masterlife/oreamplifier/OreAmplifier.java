package net.masterlife.oreamplifier;

import net.fabricmc.api.ModInitializer;

import net.masterlife.oreamplifier.block.ModBlocks;
import net.masterlife.oreamplifier.item.ModItems;
import net.masterlife.oreamplifier.world.feature.ModConfiguredFeatures;
import net.masterlife.oreamplifier.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OreAmplifier implements ModInitializer {
	public static final String MOD_ID = "oreamplifier";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
	}
}