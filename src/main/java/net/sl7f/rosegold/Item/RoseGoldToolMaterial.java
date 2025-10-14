package net.sl7f.rosegold.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.sl7f.rosegold.util.ModTags;

public class RoseGoldToolMaterial {
    public static final ToolMaterial ROSE_GOLD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 500, 12.0f, 2.0f, 20,
            ModTags.Items.ROSE_GOLD_REPAIR);
}
