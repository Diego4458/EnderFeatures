package com.diego4458.enderfeatures;

import com.diego4458.enderfeatures.Enchantment.Enchantments;
import com.diego4458.enderfeatures.blocks.ModBlocks;
import com.diego4458.enderfeatures.item.ModItems;
import com.diego4458.enderfeatures.worldFeatures.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "enderfeatures";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//RegisterItems
		Enchantments.RegisterEnchantments();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//World Modification
		ModOreGeneration.generateOres();
	}
}
