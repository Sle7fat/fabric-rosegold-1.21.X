package net.sl7f.rosegold.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.sl7f.rosegold.Item.ModItems;

public class ModLootTablesModifiers {

    private static final RegistryKey<?>[] TARGET_CHESTS = {
            LootTables.VILLAGE_TOOLSMITH_CHEST,
            LootTables.VILLAGE_WEAPONSMITH_CHEST,
            LootTables.DESERT_PYRAMID_CHEST,
            LootTables.ABANDONED_MINESHAFT_CHEST,
            LootTables.STRONGHOLD_CORRIDOR_CHEST,
            LootTables.JUNGLE_TEMPLE_CHEST,
            LootTables.WOODLAND_MANSION_CHEST,
            LootTables.BURIED_TREASURE_CHEST,
            LootTables.SHIPWRECK_TREASURE_CHEST,
            LootTables.RUINED_PORTAL_CHEST
    };

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            for (RegistryKey<?> target : TARGET_CHESTS) {
                if (key.equals(target)) {
                    LootPool pool = LootPool.builder()
                            .rolls(BinomialLootNumberProvider.create(2, 0.05f))
                            .with(ItemEntry.builder(ModItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE)
                                    .weight(2))
                            .build();
                    tableBuilder.pool(pool);
                    break;
                }
            }
        });
    }
}