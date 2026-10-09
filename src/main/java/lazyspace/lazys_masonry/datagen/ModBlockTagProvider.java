package lazyspace.lazys_masonry.datagen;

import lazyspace.lazys_masonry.Lazys_Masonry;
import lazyspace.lazys_masonry.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.POLISHED_ANDESITE_TILE_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_ANDESITE_TILE_WALL);

        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.POLISHED_DIORITE_TILE_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.POLISHED_DIORITE_TILE_STAIRS);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_DIORITE_TILE_WALL);

        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.POLISHED_GRANITE_TILE_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.POLISHED_GRANITE_TILE_STAIRS);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_GRANITE_TILE_WALL);

        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_BLACKSTONE_TILE_WALL);

        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.POLISHED_TUFF_TILE_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.POLISHED_TUFF_TILE_STAIRS);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_TUFF_TILE_WALL);
    }
}
