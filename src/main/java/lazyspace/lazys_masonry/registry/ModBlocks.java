package lazyspace.lazys_masonry.registry;

import lazyspace.lazys_masonry.Lazys_Masonry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
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
    //public static final Block POLISHED_ANDESITE_TILE_SLAB = register("polished_andesite_tile", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB), true);
    //public static final Block POLISHED_ANDESITE_TILE_STAIRS = registerStair("polished_andesite_tile", POLISHED_ANDESITE_TILE);

}
