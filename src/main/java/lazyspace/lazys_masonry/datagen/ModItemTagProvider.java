package lazyspace.lazys_masonry.datagen;

import lazyspace.lazys_masonry.Lazys_Masonry;
import lazyspace.lazys_masonry.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
    }

    public static final TagKey<Item> STONE_CONVERTABLE = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Lazys_Masonry.MOD_ID, "stone_convertable"));
}
