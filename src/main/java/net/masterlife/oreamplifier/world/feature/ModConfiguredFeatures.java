package net.masterlife.oreamplifier.world.feature;

import net.masterlife.oreamplifier.OreAmplifier;
import net.masterlife.oreamplifier.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> DEATH_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.STONE), ModBlocks.DEATH_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_DEATH_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_DEATH =
            ConfiguredFeatures.register("ore_death", Feature.ORE, new OreFeatureConfig(DEATH_ORES, 8));

    public static void registerConfiguredFeatures() {
        OreAmplifier.LOGGER.debug("Registering the ModConfiguredFeatures for " + OreAmplifier.MOD_ID);
    }
}
