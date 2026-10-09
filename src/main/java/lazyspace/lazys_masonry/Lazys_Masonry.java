package lazyspace.lazys_masonry;

import lazyspace.lazys_masonry.registry.ModBlocks;
import lazyspace.lazys_masonry.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lazys_Masonry implements ModInitializer {
	public static final String MOD_ID = "lazys_masonry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.initialize();

		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
