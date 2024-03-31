package net.toby.tobytechmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.toby.tobytechmod.TobyTechMod;
import net.toby.tobytechmod.item.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier TOBYKNIFE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 70, 5, 4, 25,
                    ModTags.Blocks.TOBYPLANTS, () -> Ingredient.of(ModItems.DRAGONBONE_KNIFE.get())),
            new ResourceLocation(TobyTechMod.MOD_ID, "dragonboneknife"), List.of(Tiers.NETHERITE), List.of());

}
