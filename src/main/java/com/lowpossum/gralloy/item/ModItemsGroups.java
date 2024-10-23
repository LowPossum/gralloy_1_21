package com.lowpossum.gralloy.item;

import com.lowpossum.gralloy.Gralloy;
import com.lowpossum.gralloy.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {

    //Declaring new custom item group
    //NEW ITEMS GROUP
    public static final ItemGroup GRALLOY_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gralloy.MOD_ID, "gralloy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GRALLOY_INGOT))
                    .displayName(Text.translatable("itemgroup.gralloy.gralloy_items"))
                    .entries((displayContext, entries) -> {
                        //Add item to this group here
                        entries.add(ModItems.GRALLOY_INGOT);
                    }).build());

    //NEW BLOCKS GROUP
    public static final ItemGroup GRALLOY_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gralloy.MOD_ID, "gralloy_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GRALLOY_BLOCK))
                    .displayName(Text.translatable("itemgroup.gralloy.gralloy_blocks"))
                    .entries((displayContext, entries) -> {
                        //Add item to this group here
                        entries.add(ModBlocks.GRALLOY_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Gralloy.LOGGER.info("Registering Item Groups for " + Gralloy.MOD_ID);
    }
}
