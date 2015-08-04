package com.destinyplayer.mcml;

import com.destinyplayer.mcml.references.Reference;
import com.destinyplayer.mcml.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MCModsLearning
{
    @Mod.Instance(Reference.MOD_ID)
    public static MCModsLearning instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre Initialisation Start");

        LogHelper.info("Pre Initialisation Complete");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialisation Start");

        LogHelper.info("Initialisation Complete");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Start");

        LogHelper.info("Post Initialisation Complete");
    }
}
