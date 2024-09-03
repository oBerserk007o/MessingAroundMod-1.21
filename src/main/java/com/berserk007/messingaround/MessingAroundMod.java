package com.berserk007.messingaround;

import com.berserk007.messingaround.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(MessingAroundMod.MOD_ID)
public class MessingAroundMod {
    public static final String MOD_ID = "messingaround";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MessingAroundMod(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);

        ModItems.ITEMS.register(modEventBus);
    }
}
