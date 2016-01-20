package com.thomsa89.firstmod;

import com.thomsa89.firstmod.handler.ConfigurationHandler;
import com.thomsa89.firstmod.init.ModItems;
import com.thomsa89.firstmod.proxy.IProxy;
import com.thomsa89.firstmod.reference.Reference;
import com.thomsa89.firstmod.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FirstMod {
    @Mod.Instance(Reference.MOD_ID)
    public static FirstMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /**
     * Configurations (Networkconfiguration, Modconfig), Items, Blocks.
     * @param event PreInitialization
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();
    }

    /**
     * Registry GUI, Tile entitys, Crafting, general Eventhandlers.
     * @param event Initialization
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("Initialization Complete!");
    }

    /**
     * Rapping things up.
     * @param event PostInitialization
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!");
    }
}
