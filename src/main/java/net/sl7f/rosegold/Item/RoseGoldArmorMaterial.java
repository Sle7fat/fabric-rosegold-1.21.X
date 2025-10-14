package net.sl7f.rosegold.Item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.sl7f.rosegold.RoseGold;
import net.sl7f.rosegold.util.ModTags;

import java.util.EnumMap;

public class RoseGoldArmorMaterial {

    public static final ArmorMaterial ROSE_GOLD_ARMOR_MATERIAL = new ArmorMaterial(500,
            Util.make(new EnumMap<>(EquipmentType.class), map -> {
                map.put(EquipmentType.BOOTS, 2);
                map.put(EquipmentType.LEGGINGS, 5);
                map.put(EquipmentType.CHESTPLATE, 7);
                map.put(EquipmentType.HELMET, 2);
                map.put(EquipmentType.BODY, 9);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,1.0f, 0.05f ,ModTags.Items.ROSE_GOLD_REPAIR,
                    Identifier.of(RoseGold.MOD_ID, "rose_gold"));


}
