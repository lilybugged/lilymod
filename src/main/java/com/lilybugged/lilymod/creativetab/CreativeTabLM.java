package com.lilybugged.lilymod.creativetab;

import com.lilybugged.lilymod.init.ModItems;
import com.lilybugged.lilymod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLM {

    public static final CreativeTabs LM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }


    };

}
