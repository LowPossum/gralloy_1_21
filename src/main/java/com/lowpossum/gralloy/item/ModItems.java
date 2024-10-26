package com.lowpossum.gralloy.item;

import com.lowpossum.gralloy.Gralloy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Create the new ingot
    public static final Item GRALLOY_INGOT = registerItem("gralloy_ingot", new Item(new Item.Settings()));
    //Create new powder
    public static final Item NETHERITE_POWDER = registerItem("netherite_powder", new Item(new Item.Settings()));
    //Create the new sword
    public static final Item GRALLOY_SWORD = registerItem("gralloy_sword", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Gralloy.MOD_ID, name), item);
    }

    public static void registerModItems() {

        Gralloy.LOGGER.info("Registering Mod Items for " + Gralloy.MOD_ID);

        //Add item to the INGREDIENT group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GRALLOY_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(NETHERITE_POWDER);});

        //Add item to the COMBAT group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GRALLOY_SWORD);});
    }

}
