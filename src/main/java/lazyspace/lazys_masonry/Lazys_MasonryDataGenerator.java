package lazyspace.lazys_masonry;

import lazyspace.lazys_masonry.datagen.ModBlockTagProvider;
import lazyspace.lazys_masonry.datagen.ModEnglishLangProvider;
import lazyspace.lazys_masonry.datagen.ModItemTagProvider;
import lazyspace.lazys_masonry.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Lazys_MasonryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
	}
}
