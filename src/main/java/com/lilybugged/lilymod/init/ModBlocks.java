package com.lilybugged.lilymod.init;

import com.lilybugged.lilymod.block.BlockFlag;
import com.lilybugged.lilymod.block.BlockLM;
import com.lilybugged.lilymod.creativetab.CreativeTabLM;
import com.lilybugged.lilymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLM flag = new BlockFlag();

    public static void init() {

        GameRegistry.registerBlock(flag, "flag");

    }
}
