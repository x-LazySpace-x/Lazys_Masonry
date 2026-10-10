package lazyspace.lazys_masonry.datagen;

import lazyspace.lazys_masonry.Lazys_Masonry;
import lazyspace.lazys_masonry.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_TILE, Blocks.POLISHED_ANDESITE);
                stoneCuttingRecipe(Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_ANDESITE_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_ANDESITE_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_ANDESITE_TILE_FAMILY, output, Blocks.POLISHED_ANDESITE);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_ANDESITE_TILE_FAMILY, output, Blocks.ANDESITE);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_TILE, Blocks.POLISHED_DIORITE);
                stoneCuttingRecipe(Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_DIORITE_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DIORITE_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DIORITE_TILE_FAMILY, output, Blocks.POLISHED_DIORITE);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DIORITE_TILE_FAMILY, output, Blocks.DIORITE);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_TILE, Blocks.POLISHED_GRANITE);
                stoneCuttingRecipe(Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_GRANITE_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_GRANITE_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_GRANITE_TILE_FAMILY, output, Blocks.POLISHED_GRANITE);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_GRANITE_TILE_FAMILY, output, Blocks.GRANITE);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLACKSTONE_TILE, Blocks.POLISHED_BLACKSTONE);
                stoneCuttingRecipe(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_BLACKSTONE_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_BLACKSTONE_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_BLACKSTONE_TILE_FAMILY, output, Blocks.POLISHED_BLACKSTONE);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_BLACKSTONE_TILE_FAMILY, output, Blocks.BLACKSTONE);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TUFF_TILE, Blocks.POLISHED_TUFF);
                stoneCuttingRecipe(Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_TUFF_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_TUFF_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_TUFF_TILE_FAMILY, output, Blocks.POLISHED_TUFF);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_TUFF_TILE_FAMILY, output, Blocks.TUFF);

                twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DEEPSLATE_TILE, Blocks.POLISHED_DEEPSLATE);
                stoneCuttingRecipe(Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_TILE, 1, output);
                generateRecipes(ModBlocks.POLISHED_DEEPSLATE_TILE_FAMILY, FeatureFlags.VANILLA_SET);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DEEPSLATE_TILE_FAMILY, output);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DEEPSLATE_TILE_FAMILY, output, Blocks.POLISHED_DEEPSLATE);
                stoneCuttingFamilyRecipe(ModBlocks.POLISHED_DEEPSLATE_TILE_FAMILY, output, Blocks.COBBLED_DEEPSLATE);

                stoneCuttingRecipe(Blocks.STONE, Blocks.ANDESITE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.DIORITE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.GRANITE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.BLACKSTONE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.TUFF, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.DEEPSLATE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.COBBLESTONE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.SMOOTH_STONE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.COBBLED_DEEPSLATE, 1, output);
                stoneCuttingRecipe(Blocks.STONE, Blocks.CALCITE, 1, output);
            }
        };
    }

    public static void stoneCuttingRecipe(
            ItemLike input,
            ItemLike result,
            int count,
            RecipeOutput output
    ) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(
                Lazys_Masonry.MOD_ID,
                "stonecutting/" +
                        BuiltInRegistries.ITEM.getKey(result.asItem()).getPath()
                        + "_from_" +
                        BuiltInRegistries.ITEM.getKey(input.asItem()).getPath()
        );

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(input),
                RecipeCategory.BUILDING_BLOCKS,
                result,
                count
        ).unlockedBy(
                "has_input",
                InventoryChangeTrigger.TriggerInstance.hasItems(input)
        ).save(output, String.valueOf(recipeId));
    }

    public static void stoneCuttingFamilyRecipe(BlockFamily family, RecipeOutput output) {

        for (Block variant : family.getVariants().values()) {
            stoneCuttingRecipe(family.getBaseBlock(), variant, 1, output);
        }
    }

    public static void stoneCuttingFamilyRecipe(BlockFamily family, RecipeOutput output, ItemLike base) {

        for (Block variant : family.getVariants().values()) {
            stoneCuttingRecipe(base, variant, 1, output);
        }
    }

    @Override
    public String getName() {
        return "ExampleModRecipeProvider";
    }
}