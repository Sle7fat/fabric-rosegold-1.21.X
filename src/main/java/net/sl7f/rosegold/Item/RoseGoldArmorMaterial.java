package net.sl7f.rosegold.Item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.sl7f.rosegold.RoseGold;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class RoseGoldArmorMaterial {

    public static final RegistryEntry<ArmorMaterial> ROSE_GOLD_ARMOR_MATERIAL = registerArmorMaterial("rose_gold",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 9);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(ModItems.ROSE_GOLD_ALLOY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(RoseGold.MOD_ID, "rose_gold"))), 1.0f, 0.05f));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(RoseGold.MOD_ID, name), material.get());
    }
}
