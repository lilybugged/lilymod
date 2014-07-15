package com.lilybugged.lilymod;

import com.lilybugged.lilymod.proxy.IProxy;
import com.lilybugged.lilymod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION)
public class lilymod {
    @Mod.Instance(Reference.MOD_ID)
    public static lilymod instance;

    @SidedProxy(clientSide="com.lilybugged.lilymod.proxy.ClientProxy",serverSide="com.lilybugged.lilymod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
