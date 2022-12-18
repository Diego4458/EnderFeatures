package com.diego4458.enderfeatures.worldFeatures;

import com.diego4458.enderfeatures.ExampleMod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(ExampleMod.MOD_ID, "enderium_ore"), ModConfiguratedFeatures.END_ENDERIUM_ORES);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ExampleMod.MOD_ID, "enderium_ore"),
                ModPlacedFeatures.ENDERIUM_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd().and(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS)), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(ExampleMod.MOD_ID, "enderium_ore")));
    }
}