package com.example.minimapmod;

import net.fabricmc.api.ModInitializer;

public class MinimapMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Server-side code only (no MinecraftClient, no textures, no HudRenderCallback)
        System.out.println("MinimapMod server initialized.");
    }
}

