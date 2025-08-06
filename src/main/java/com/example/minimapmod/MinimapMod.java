package com.example.minimapmod;

import net.fabricmc.api.ModInitializer;

public class MinimapMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Server-side initializer (no client-only code here)
        System.out.println("MinimapMod initialized");
    }
}

