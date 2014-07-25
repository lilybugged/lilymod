package com.lilybugged.lilymod.item;

import com.lilybugged.lilymod.creativetab.CreativeTabLM;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemMapleLeaf extends ItemLM {

    public ItemMapleLeaf(){
        super();
        this.setUnlocalizedName("mapleLeaf");
        this.setFull3D();
        this.setHarvestLevel("pickaxe", 3);
        this.setMaxStackSize(1);



    }
}
