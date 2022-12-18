package com.diego4458.enderfeatures.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class ModAxe extends MiningToolItem {
    public ModAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings){
            super(attackDamage, attackSpeed, material, BlockTags.AXE_MINEABLE, settings);
    }
}


