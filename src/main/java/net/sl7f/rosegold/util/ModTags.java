package net.sl7f.rosegold.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sl7f.rosegold.RoseGold;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RoseGold.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> ROSE_GOLD_REPAIR = createTag("rose_gold_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RoseGold.MOD_ID, name));
        }
    }


}
