package net.sl7f.rosegold;

import net.fabricmc.api.ModInitializer;

import net.sl7f.rosegold.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoseGold implements ModInitializer {
	public static final String MOD_ID = "rosegold";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

	}
}