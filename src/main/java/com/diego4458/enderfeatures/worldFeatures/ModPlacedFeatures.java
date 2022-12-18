package com.diego4458.enderfeatures.worldFeatures;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class ModPlacedFeatures {
    public static final PlacedFeature ENDERIUM_ORE_PLACED = new PlacedFeature(
                    RegistryEntry.of(ModConfiguratedFeatures.END_ENDERIUM_ORES),
                    Arrays.asList(
                            CountPlacementModifier.of(6),
                            SquarePlacementModifier.of(),
                            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));
}
