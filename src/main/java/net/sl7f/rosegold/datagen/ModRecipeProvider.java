package net.sl7f.rosegold.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.sl7f.rosegold.Item.ModItems;
import org.intellij.lang.annotations.Identifier;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        final Map<Item, Item> IRON_TO_ROSE_GOLD_TOOLS = Map.of(
                Items.IRON_PICKAXE, ModItems.ROSE_GOLD_PICKAXE,
                Items.IRON_AXE, ModItems.ROSE_GOLD_AXE,
                Items.IRON_SHOVEL, ModItems.ROSE_GOLD_SHOVEL,
                Items.IRON_HOE, ModItems.ROSE_GOLD_HOE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_ALLOY)
                .input(Items.GOLD_INGOT, 4)
                .input(Items.COPPER_INGOT, 4)
                .criterion("has_copper", conditionsFromItem(Items.COPPER_INGOT))
                .criterion("has_gold", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("isi")
                .pattern("ici")
                .pattern("iii")
                .input('i', Items.IRON_INGOT)
                .input('s', ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE)
                .input('c', Items.COBBLESTONE)
                .criterion(hasItem(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter);


        IRON_TO_ROSE_GOLD_TOOLS.forEach((ironTool, roseGoldTool) -> {
            SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE),
                            Ingredient.ofItems(ironTool),
                            Ingredient.ofItems(ModItems.ROSE_GOLD_ALLOY),
                            RecipeCategory.TOOLS,
                            roseGoldTool)
                    .criterion("has_rose_gold_alloy", conditionsFromItem(ModItems.ROSE_GOLD_ALLOY))
                    .criterion(hasItem(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE))
                    .offerTo(exporter, getRecipeName(roseGoldTool));
        });







    }
}
