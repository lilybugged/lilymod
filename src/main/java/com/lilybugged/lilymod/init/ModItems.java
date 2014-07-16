package com.lilybugged.lilymod.init;

import com.lilybugged.lilymod.item.ItemLM;
import com.lilybugged.lilymod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemLM mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
