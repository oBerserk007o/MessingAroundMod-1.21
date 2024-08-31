package com.berserk007.messingaround.item;

import com.berserk007.messingaround.MessingAroundMod;
import com.berserk007.messingaround.item.custom.AdvancedClockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MessingAroundMod.MOD_ID);


    public static final DeferredItem<Item> METAL_COG =
            ITEMS.registerItem("metal_cog", Item::new, new Item.Properties());

    // To keep track of the time I'm wasting on fixing dumb bugs
    public static final DeferredItem<Item> ADVANCED_CLOCK =
            ITEMS.registerItem("advanced_clock", AdvancedClockItem::new, new Item.Properties());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}