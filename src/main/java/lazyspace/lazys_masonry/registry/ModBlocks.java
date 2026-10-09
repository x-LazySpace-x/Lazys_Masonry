package lazyspace.lazys_masonry.registry;

import lazyspace.lazys_masonry.Lazys_Masonry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static void initialize() {
    }

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerStair(String string, Block block) {
        return register(string, (properties) -> new StairBlock(block.defaultBlockState(), properties), BlockBehaviour.Properties.ofFullCopy(block), true);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Lazys_Masonry.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Lazys_Masonry.MOD_ID, name));
    }

    public static final Block POLISHED_ANDESITE_TILE = register("polished_andesite_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE), true);
    public static final Block POLISHED_ANDESITE_TILE_SLAB = register("polished_andesite_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_ANDESITE_TILE_STAIRS = registerStair("polished_andesite_tile_stairs", POLISHED_ANDESITE_TILE);
    public static final Block POLISHED_ANDESITE_TILE_WALL = register("polished_andesite_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_ANDESITE_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_ANDESITE_TILE)
                    .stairs(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_ANDESITE_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_ANDESITE_TILE_WALL)
                    .getFamily();

    public static final Block POLISHED_DIORITE_TILE = register("polished_diorite_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE), true);
    public static final Block POLISHED_DIORITE_TILE_SLAB = register("polished_diorite_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_DIORITE_TILE_STAIRS = registerStair("polished_diorite_tile_stairs", POLISHED_DIORITE_TILE);
    public static final Block POLISHED_DIORITE_TILE_WALL = register("polished_diorite_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_DIORITE_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_DIORITE_TILE)
                    .stairs(ModBlocks.POLISHED_DIORITE_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_DIORITE_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_DIORITE_TILE_WALL)
                    .getFamily();

    public static final Block POLISHED_GRANITE_TILE = register("polished_granite_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE), true);
    public static final Block POLISHED_GRANITE_TILE_SLAB = register("polished_granite_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_GRANITE_TILE_STAIRS = registerStair("polished_granite_tile_stairs", POLISHED_GRANITE_TILE);
    public static final Block POLISHED_GRANITE_TILE_WALL = register("polished_granite_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_GRANITE_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_GRANITE_TILE)
                    .stairs(ModBlocks.POLISHED_GRANITE_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_GRANITE_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_GRANITE_TILE_WALL)
                    .getFamily();

    public static final Block POLISHED_BLACKSTONE_TILE = register("polished_blackstone_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE), true);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = register("polished_blackstone_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerStair("polished_blackstone_tile_stairs", POLISHED_BLACKSTONE_TILE);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = register("polished_blackstone_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_BLACKSTONE_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_BLACKSTONE_TILE)
                    .stairs(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_BLACKSTONE_TILE_WALL)
                    .getFamily();

    public static final Block POLISHED_TUFF_TILE = register("polished_tuff_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_TUFF), true);
    public static final Block POLISHED_TUFF_TILE_SLAB = register("polished_tuff_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_TUFF_TILE_STAIRS = registerStair("polished_tuff_tile_stairs", POLISHED_TUFF_TILE);
    public static final Block POLISHED_TUFF_TILE_WALL = register("polished_tuff_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_TUFF_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_TUFF_TILE)
                    .stairs(ModBlocks.POLISHED_TUFF_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_TUFF_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_TUFF_TILE_WALL)
                    .getFamily();


    public static final Block POLISHED_DEEPSLATE_TILE = register("polished_deepslate_tile", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE), true);
    public static final Block POLISHED_DEEPSLATE_TILE_SLAB = register("polished_deepslate_tile_slab", SlabBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);
    public static final Block POLISHED_DEEPSLATE_TILE_STAIRS = registerStair("polished_deepslate_tile_stairs", POLISHED_DEEPSLATE_TILE);
    public static final Block POLISHED_DEEPSLATE_TILE_WALL = register("polished_deepslate_tile_wall", WallBlock::new, BlockBehaviour.Properties.of().sound(SoundType.STONE), true);

    public static final BlockFamily POLISHED_DEEPSLATE_TILE_FAMILY =
            new BlockFamily.Builder(ModBlocks.POLISHED_DEEPSLATE_TILE)
                    .stairs(ModBlocks.POLISHED_DEEPSLATE_TILE_STAIRS)
                    .slab(ModBlocks.POLISHED_DEEPSLATE_TILE_SLAB)
                    .wall(ModBlocks.POLISHED_DEEPSLATE_TILE_WALL)
                    .getFamily();
}
