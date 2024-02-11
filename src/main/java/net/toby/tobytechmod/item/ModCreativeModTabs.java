package net.toby.tobytechmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.toby.tobytechmod.TobyTechMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TobyTechMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOBYTECHMOD_TAB = CREATIVE_MODE_TABS.register("tobytechmod_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FIRESTEEL_PICK_HEAD.get()))
            .title(Component.translatable("creativetab.tobytechmod_tab"))
            .displayItems((pParameters, pOutput) -> {
             pOutput.accept(ModItems.LIGHTNINGSTEEL_DOUBLE_INGOT.get());
             pOutput.accept(ModItems.FIRESTEEL_DOUBLE_INGOT.get());
             pOutput.accept(ModItems.ICESTEEL_DOUBLE_INGOT.get());
             pOutput.accept(ModItems.LIGHTNINGSTEEL_PICK_HEAD.get());
             pOutput.accept(ModItems.ICESTEEL_PICK_HEAD.get());
             pOutput.accept(ModItems.FIRESTEEL_PICK_HEAD.get());
             pOutput.accept(ModItems.ICESTEEL_AXE_HEAD.get());
             pOutput.accept(ModItems.FIRESTEEL_AXE_HEAD.get());
             pOutput.accept(ModItems.LIGHTNINGSTEEL_AXE_HEAD.get());
             pOutput.accept(ModItems.LIGHTNINGSTEEL_HOE_HEAD.get());
             pOutput.accept(ModItems.FIRESTEEL_HOE_HEAD.get());
             pOutput.accept(ModItems.ICESTEEL_HOE_HEAD.get());
             pOutput.accept(ModItems.ICESTEEL_SWORD_HEAD.get());
             pOutput.accept(ModItems.LIGHTNINGSTEEL_SWORD_HEAD.get());
             pOutput.accept(ModItems.FIRESTEEL_SWORD_HEAD.get());
             pOutput.accept(ModItems.FIRESTEEL_SHOVEL_HEAD.get());
             pOutput.accept(ModItems.LIGHTNINGSTEEL_SHOVEL_HEAD.get());
             pOutput.accept(ModItems.ICESTEEL_SHOVEL_HEAD.get());
             pOutput.accept(ModItems.DRAGONBONE_SHOVEL_HEAD.get());
             pOutput.accept(ModItems.DRAGONBONE_SWORD_HEAD.get());
             pOutput.accept(ModItems.DRAGONBONE_AXE_HEAD.get());
             pOutput.accept(ModItems.DRAGONBONE_HOE_HEAD.get());
             pOutput.accept(ModItems.DRAGONBONE_ARROW_HEAD.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
