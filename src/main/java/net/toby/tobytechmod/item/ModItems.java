package net.toby.tobytechmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toby.tobytechmod.TobyTechMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TobyTechMod.MOD_ID);

    public static final RegistryObject<Item> DRAGONBONE_PICK_HEAD = ITEMS.register("dragonbone_pick_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_DOUBLE_INGOT = ITEMS.register("lightningsteel_double_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_DOUBLE_INGOT = ITEMS.register("icesteel_double_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_DOUBLE_INGOT = ITEMS.register("firesteel_double_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_PICK_HEAD = ITEMS.register("lightningsteel_pick_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_PICK_HEAD = ITEMS.register("firesteel_pick_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_PICK_HEAD = ITEMS.register("icesteel_pick_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_SHOVEL_HEAD = ITEMS.register("icesteel_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_SHOVEL_HEAD = ITEMS.register("firesteel_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_SHOVEL_HEAD = ITEMS.register("lightningsteel_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_HOE_HEAD = ITEMS.register("icesteel_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_HOE_HEAD = ITEMS.register("lightningsteel_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_HOE_HEAD = ITEMS.register("firesteel_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_SWORD_HEAD = ITEMS.register("firesteel_sword_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_SWORD_HEAD = ITEMS.register("lightningsteel_sword_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_SWORD_HEAD = ITEMS.register("icesteel_sword_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTEEL_AXE_HEAD = ITEMS.register("firesteel_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGSTEEL_AXE_HEAD = ITEMS.register("lightningsteel_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICESTEEL_AXE_HEAD = ITEMS.register("icesteel_axe_head",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
