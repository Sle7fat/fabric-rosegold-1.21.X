package net.sl7f.rosegold.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sl7f.rosegold.RoseGold;

public class ModItems {

    public static final Item ROSE_GOLD_ALLOY = registerItem("rose_gold_alloy", new Item(new Item.Settings()));

    public static final RoseGoldSmithingTemplateItem ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE =
            registerRoseGoldSmithingTemplateItem("rose_gold_upgrade_smithing_template", new RoseGoldSmithingTemplateItem(new Item.Settings()));

    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(RoseGoldToolMaterial.ROSE_GOLD_SWORD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RoseGoldToolMaterial.ROSE_GOLD_SWORD, 3, -2.4f))));

    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new AxeItem(RoseGoldToolMaterial.ROSE_GOLD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RoseGoldToolMaterial.ROSE_GOLD, 6, -3.1f))));

    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new PickaxeItem(RoseGoldToolMaterial.ROSE_GOLD_SWORD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RoseGoldToolMaterial.ROSE_GOLD_SWORD, 1, -2.8f))));

    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(RoseGoldToolMaterial.ROSE_GOLD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RoseGoldToolMaterial.ROSE_GOLD, 2, -3.0f))));

    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new HoeItem(RoseGoldToolMaterial.ROSE_GOLD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RoseGoldToolMaterial.ROSE_GOLD, -2, 0f))));


    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));

    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));

    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));

    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(RoseGoldArmorMaterial.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));



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
