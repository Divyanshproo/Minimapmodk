package com.example.minimapmod;

import net.fabricmc.api.ClientModInitializer;

public class MinimapMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinimapRenderer.init(); // Hook into HUD render event
    }
}