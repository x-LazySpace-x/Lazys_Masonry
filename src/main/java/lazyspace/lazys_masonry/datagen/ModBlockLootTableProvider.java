package lazyspace.lazys_masonry.datagen;

import lazyspace.lazys_masonry.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.POLISHED_ANDESITE_TILE);
        dropSelf(ModBlocks.POLISHED_ANDESITE_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_ANDESITE_TILE_WALL);

        dropSelf(ModBlocks.POLISHED_DIORITE_TILE);
        dropSelf(ModBlocks.POLISHED_DIORITE_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_DIORITE_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_DIORITE_TILE_WALL);

        dropSelf(ModBlocks.POLISHED_GRANITE_TILE);
        dropSelf(ModBlocks.POLISHED_GRANITE_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_GRANITE_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_GRANITE_TILE_WALL);

        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILE);
        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILE_WALL);

        dropSelf(ModBlocks.POLISHED_TUFF_TILE);
        dropSelf(ModBlocks.POLISHED_TUFF_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_TUFF_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_TUFF_TILE_WALL);

        dropSelf(ModBlocks.POLISHED_DEEPSLATE_TILE);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_TILE_SLAB);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_TILE_STAIRS);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_TILE_WALL);
    }
}
