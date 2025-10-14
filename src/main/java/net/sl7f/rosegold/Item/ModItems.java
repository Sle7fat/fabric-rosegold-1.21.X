package net.sl7f.rosegold.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sl7f.rosegold.RoseGold;

public class ModItems {

    public static final Item ROSE_GOLD_ALLOY = registerItem("rose_gold_alloy", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_alloy")))));

    public static final RoseGoldSmithingTemplateItem ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE =
            registerRoseGoldSmithingTemplateItem("rose_gold_upgrade_smithing_template", new RoseGoldSmithingTemplateItem(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_upgrade_smithing_template")))));

    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(RoseGoldToolMaterial.ROSE_GOLD, 3.5f, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_sword")))));

    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new AxeItem(RoseGoldToolMaterial.ROSE_GOLD, 6, -3.1f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_axe")))));

    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new PickaxeItem(RoseGoldToolMaterial.ROSE_GOLD, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_pickaxe")))));

    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(RoseGoldToolMaterial.ROSE_GOLD, 2, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_shovel")))));

    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new HoeItem(RoseGoldToolMaterial.ROSE_GOLD, -2, 0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_hoe")))));


    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_helmet")))));

    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_chestplate")))));

    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_leggings")))));

    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, "rose_gold_boots")))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RoseGold.MOD_ID, name), item);
    }

    private static RoseGoldSmithingTemplateItem registerRoseGoldSmithingTemplateItem(String name, RoseGoldSmithingTemplateItem item) {
        return Registry.register(Registries.ITEM, Identifier.of(RoseGold.MOD_ID, name), item);
    }



    public static void registerModItems () {
        RoseGold.LOGGER.info("Registering Mod Items for " + RoseGold.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.GOLD_INGOT,ROSE_GOLD_ALLOY);
            entries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.GOLDEN_SWORD, ROSE_GOLD_SWORD);
            entries.addAfter(Items.GOLDEN_AXE, ROSE_GOLD_AXE);
            entries.addAfter(Items.GOLDEN_BOOTS, ROSE_GOLD_HELMET);
            entries.addAfter(ROSE_GOLD_HELMET, ROSE_GOLD_CHESTPLATE);
            entries.addAfter(ROSE_GOLD_CHESTPLATE, ROSE_GOLD_LEGGINGS);
            entries.addAfter(ROSE_GOLD_LEGGINGS, ROSE_GOLD_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.GOLDEN_HOE, ROSE_GOLD_SHOVEL);
            entries.addAfter(ROSE_GOLD_SHOVEL, ROSE_GOLD_PICKAXE);
            entries.addAfter(ROSE_GOLD_PICKAXE, ROSE_GOLD_AXE);
            entries.addAfter(ROSE_GOLD_AXE, ROSE_GOLD_HOE);
        });

    }

}
