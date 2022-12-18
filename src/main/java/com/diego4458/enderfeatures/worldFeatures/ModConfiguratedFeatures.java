package com.diego4458.enderfeatures.worldFeatures;

import com.diego4458.enderfeatures.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguratedFeatures {
    public static final ConfiguredFeature<?, ?> END_ENDERIUM_ORES = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // we use new BlockMatchRuleTest(Blocks.END_STONE) here
                    ModBlocks.ENDERIUM_ORE.getDefaultState(),
                    4));

}
