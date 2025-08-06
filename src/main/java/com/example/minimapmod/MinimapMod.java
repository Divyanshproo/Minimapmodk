// MinimapMod.java
package com.example.minimapmod;

import net.fabricmc.api.ModInitializer;

public class MinimapMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // No client-side code here
        System.out.println("MinimapMod (server/init) loaded");
    }
}
