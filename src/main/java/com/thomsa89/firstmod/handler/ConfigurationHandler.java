package com.thomsa89.firstmod.handler;

import com.thomsa89.firstmod.reference.Reference;
import com.thomsa89.firstmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean configValue = false;

    public static void init(File configFile) {
        // Create Configuration
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync configs
            loadConfiguration();
        }
    }

    public void loadConfiguration() {
        configValue = configuration.getBoolean(Configuration.CATEGORY_GENERAL, "configValue", true, "config Value");

        // Save if changed
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}

