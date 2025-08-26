package net.sl7f.rosegold;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class RoseGoldArmorMaterial {


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(RoseGold.MOD_ID, name), material.get());
    }
}
