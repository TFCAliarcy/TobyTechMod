package net.toby.tobytechmod.item.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.toby.tobytechmod.TobyTechMod;

public class ModTags {
    public static class  Blocks {

        public static final TagKey<Block> DRAGONBONE_KNIFE_DROPS = tag("dragonbone_knife_drops");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TobyTechMod.MOD_ID, name));
        }
    }

    public static class Items{

    }
}
