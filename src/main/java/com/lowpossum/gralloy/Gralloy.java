package com.lowpossum.gralloy;

import com.lowpossum.gralloy.block.ModBlocks;
import com.lowpossum.gralloy.item.ModItems;
import com.lowpossum.gralloy.item.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gralloy implements ModInitializer {
	public static final String MOD_ID = "gralloy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}