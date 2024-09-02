package com.berserk007.messingaround.item;

import com.berserk007.messingaround.MessingAroundMod;
import com.berserk007.messingaround.item.custom.AdvancedClockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MessingAroundMod.MOD_ID);

    public static final DeferredHolder<Item, Item> METAL_COG = ITEMS.register("metal_cog", () -> new Item(new Item.Properties()));

    // To keep track of the time I'm wasting on fixing dumb bugs
    public static final DeferredHolder<Item, AdvancedClockItem> ADVANCED_CLOCK = ITEMS.register("advanced_clock", () -> new AdvancedClockItem(new Item.Properties()));
}