package lazyspace.lazys_masonry.datagen;

import lazyspace.lazys_masonry.registry.ModBlocks;
import lazyspace.lazys_masonry.registry.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.model.Model;
import net.minecraft.data.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.family(ModBlocks.POLISHED_ANDESITE_TILE).generateFor(ModBlocks.POLISHED_ANDESITE_TILE_FAMILY);
        blockStateModelGenerator.family(ModBlocks.POLISHED_DIORITE_TILE).generateFor(ModBlocks.POLISHED_DIORITE_TILE_FAMILY);
        blockStateModelGenerator.family(ModBlocks.POLISHED_GRANITE_TILE).generateFor(ModBlocks.POLISHED_GRANITE_TILE_FAMILY);
        blockStateModelGenerator.family(ModBlocks.POLISHED_BLACKSTONE_TILE).generateFor(ModBlocks.POLISHED_BLACKSTONE_TILE_FAMILY);
        blockStateModelGenerator.family(ModBlocks.POLISHED_TUFF_TILE).generateFor(ModBlocks.POLISHED_TUFF_TILE_FAMILY);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "Lazys_MasonryModelProvider";
    }
}
