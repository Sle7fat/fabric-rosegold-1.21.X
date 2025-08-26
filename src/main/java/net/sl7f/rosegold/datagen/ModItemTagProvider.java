package net.sl7f.rosegold.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.sl7f.rosegold.Item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS).add(ModItems.ROSE_GOLD_ALLOY);

        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.ROSE_GOLD_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.ROSE_GOLD_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.ROSE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.ROSE_GOLD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.ROSE_GOLD_HOE);
    }
}
