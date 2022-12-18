package com.diego4458.enderfeatures.blocks;

import com.diego4458.enderfeatures.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public  static  final  Block ENDERIUM_ORE =
            registerBlock("enderium_ore",new Block(
                    FabricBlockSettings.of(Material.METAL)
                            .strength(6f)
                            .requiresTool()
                    )
                    , ItemGroup.BUILDING_BLOCKS);


    private  static  Block registerBlock(String Name, Block Block, ItemGroup Group)
    {
        registerBlockItem(Name,Block,Group);
        return Registry.register(Registry.BLOCK,new Identifier(ExampleMod.MOD_ID,Name),Block);
    }

    private static Item registerBlockItem(String Name, Block Block, ItemGroup Group) {
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID,Name), new BlockItem(
           Block,new FabricItemSettings().group(Group)
        ));
    }

    public  static  void registerModBlocks(){
        ExampleMod.LOGGER.info("Registering ModBlocks Items");
    }
}
