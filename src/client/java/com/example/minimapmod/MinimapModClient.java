package com.example.minimapmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class MinimapModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBindings.register();
        HudRenderCallback.EVENT.register(new MinimapRenderer());
    }
}