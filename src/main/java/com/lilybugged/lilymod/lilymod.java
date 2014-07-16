package com.lilybugged.lilymod;

import com.lilybugged.lilymod.handler.ConfigurationHandler;
import com.lilybugged.lilymod.init.ModBlocks;
import com.lilybugged.lilymod.init.ModItems;
import com.lilybugged.lilymod.proxy.IProxy;
import com.lilybugged.lilymod.reference.Reference;
import com.lilybugged.lilymod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class lilymod {
    @Mod.Instance(Reference.MOD_ID)
    public static lilymod instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization complete!");
    }
}
