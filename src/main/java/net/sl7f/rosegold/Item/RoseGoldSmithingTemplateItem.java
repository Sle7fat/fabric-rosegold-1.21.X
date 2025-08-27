package net.sl7f.rosegold.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.tooltip.TooltipType;

import java.util.List;

public class RoseGoldSmithingTemplateItem extends Item {

    public RoseGoldSmithingTemplateItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);

        tooltip.add(1, Text.literal("Rose Gold Upgrade").formatted(Formatting.GRAY));
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.minecraft.smithing_template.applies_to").formatted(Formatting.GRAY));
        tooltip.add(Text.literal(" Iron Equipment").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("item.minecraft.smithing_template.ingredients").formatted(Formatting.GRAY));
        tooltip.add(Text.literal(" Rose Gold Alloy").formatted(Formatting.BLUE));
    }
}