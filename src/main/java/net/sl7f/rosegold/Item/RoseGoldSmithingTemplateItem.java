package net.sl7f.rosegold.Item;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class RoseGoldSmithingTemplateItem extends SmithingTemplateItem {

    private static final Text APPLIES_TO = Text.literal("Iron Equipment").formatted(Formatting.BLUE);
    private static final Text INGREDIENTS = Text.literal("Rose Gold Alloy").formatted(Formatting.BLUE);
    private static final Text TITLE = Text.literal("Rose Gold Upgrade").formatted(Formatting.GRAY);
    private static final Text BASE_SLOT_DESCRIPTION = Text.literal("Add iron armor, weapon, or tool");
    private static final Text ADDITIONS_SLOT_DESCRIPTION = Text.literal("Add Rose Gold Alloy");

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS = Identifier.ofVanilla("item/empty_armor_slot_boots");

    private static final Identifier EMPTY_SLOT_SWORD = Identifier.ofVanilla("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_PICKAXE = Identifier.ofVanilla("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_AXE = Identifier.ofVanilla("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SHOVEL = Identifier.ofVanilla("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_HOE = Identifier.ofVanilla("item/empty_slot_hoe");

    private static final Identifier EMPTY_SLOT_INGOT = Identifier.of("rosegold", "item/rose_gold_alloy_empty");



    private static final List<Identifier> EMPTY_BASE_SLOT_TEXTURES = List.of(
            EMPTY_ARMOR_SLOT_HELMET,
            EMPTY_ARMOR_SLOT_CHESTPLATE,
            EMPTY_ARMOR_SLOT_LEGGINGS,
            EMPTY_ARMOR_SLOT_BOOTS,
            EMPTY_SLOT_SWORD,
            EMPTY_SLOT_PICKAXE,
            EMPTY_SLOT_AXE,
            EMPTY_SLOT_SHOVEL,
            EMPTY_SLOT_HOE
    );

    private static final List<Identifier> EMPTY_ADDITIONS_SLOT_TEXTURES = List.of(
            EMPTY_SLOT_INGOT
    );

    public RoseGoldSmithingTemplateItem(Settings settings) {
        super(
                APPLIES_TO,
                INGREDIENTS,
                BASE_SLOT_DESCRIPTION,
                ADDITIONS_SLOT_DESCRIPTION,
                EMPTY_BASE_SLOT_TEXTURES,
                EMPTY_ADDITIONS_SLOT_TEXTURES,
                settings
        );
    }
}