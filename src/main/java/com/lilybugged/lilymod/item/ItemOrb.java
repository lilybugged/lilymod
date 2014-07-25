package com.lilybugged.lilymod.item;

import com.lilybugged.lilymod.creativetab.CreativeTabLM;

public class ItemOrb extends ItemLM {

    public ItemOrb() {
            super();
            this.setUnlocalizedName("orb");
            this.setFull3D();
            this.setHarvestLevel("pickaxe", 3);
            this.setMaxStackSize(1);
    }
}
