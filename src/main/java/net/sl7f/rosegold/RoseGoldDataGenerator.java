package net.sl7f.rosegold;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sl7f.rosegold.datagen.ModItemTagProvider;
import net.sl7f.rosegold.datagen.ModModelProvider;
import net.sl7f.rosegold.datagen.ModRecipeProvider;

public class RoseGoldDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);

    }
}
