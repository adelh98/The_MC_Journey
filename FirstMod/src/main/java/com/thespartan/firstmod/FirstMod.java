package com.thespartan.firstmod;

import com.thespartan.firstmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class FirstMod implements ModInitializer {

    public static final String MOD_ID = "firstmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
