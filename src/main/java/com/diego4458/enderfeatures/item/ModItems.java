package com.diego4458.enderfeatures.item;

import com.diego4458.enderfeatures.ExampleMod;
import com.diego4458.enderfeatures.item.custom.ModArmorMaterials;
import com.diego4458.enderfeatures.item.custom.ModAxe;
import com.diego4458.enderfeatures.item.custom.ModPickAxe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ENDERIUM_INGOT  = registerItem("enderium_ingot",
            new Item(new FabricItemSettings()
                            .group(ItemGroup.MISC))
    );

    public static final Item ENDERIUM_NUGGET  = registerItem("enderium_nugget",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.MISC))
    );

    public static final Item RAW_ENDERIUM  = registerItem("raw_enderium",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.MISC))
    );

    //Tools Enderium
    public static final Item ENDERIUM_SWORD  = registerItem("enderium_sword",
            new SwordItem(ModMaterials.ENDERIUM,4,-2.4f,new Item.Settings().group(ItemGroup.COMBAT))
    );
    public static final Item ENDERIUM_SHOVEL  = registerItem("enderium_shovel",
            new ShovelItem(ModMaterials.ENDERIUM, 1.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS))
    );
    public static final Item ENDERIUM_PICKAXE  = registerItem("enderium_pickaxe",
            new ModPickAxe(ModMaterials.ENDERIUM, 1, -2.4f, new Item.Settings().group(ItemGroup.TOOLS))
    );
    public static final Item ENDERIUM_AXE  = registerItem("enderium_axe",
            new ModAxe(ModMaterials.ENDERIUM, 5.0f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS))
    );

    //Armor Enderium
    public static final Item ENDERIUM_HELMET  = registerItem("enderium_helmet",
            new ArmorItem(ModArmorMaterials.ENDERIUM, EquipmentSlot.HEAD,new Item.Settings().group(ItemGroup.COMBAT))
    );
    public static final Item ENDERIUM_CHESTPLATE  = registerItem("enderium_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERIUM, EquipmentSlot.CHEST,new Item.Settings().group(ItemGroup.COMBAT))
    );
    public static final Item ENDERIUM_LEGGINGS  = registerItem("enderium_leggings",
            new ArmorItem(ModArmorMaterials.ENDERIUM, EquipmentSlot.LEGS,new Item.Settings().group(ItemGroup.COMBAT))
    );
    public static final Item ENDERIUM_BOOTS  = registerItem("enderium_boots",
            new ArmorItem(ModArmorMaterials.ENDERIUM, EquipmentSlot.FEET,new Item.Settings().group(ItemGroup.COMBAT))
    );

    //Tools ENDERIUM_NETHERITE
    public static final Item ENDERIUM_NETHERITE_SWORD  = registerItem("enderium_netherite_sword",
            new SwordItem(ModMaterials.ENDERIUM_NETHERITE,4,-2.0f,new Item.Settings().group(ItemGroup.COMBAT).fireproof())
    );
    public static final Item ENDERIUM_NETHERITE_SHOVEL  = registerItem("enderium_netherite_shovel",
            new ShovelItem(ModMaterials.ENDERIUM_NETHERITE, 1.5f, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).fireproof())
    );
    public static final Item ENDERIUM_NETHERITE_PICKAXE  = registerItem("enderium_netherite_pickaxe",
            new ModPickAxe(ModMaterials.ENDERIUM_NETHERITE, 1, -2.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof())
    );
    public static final Item ENDERIUM_NETHERITE_AXE  = registerItem("enderium_netherite_axe",
            new ModAxe(ModMaterials.ENDERIUM_NETHERITE, 5.0f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof())
    );





    private static Item registerItem(String Name,Item _Item){
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID,Name),_Item);
    }

    public  static  void registerModItems(){
        ExampleMod.LOGGER.info("Registering Mod Items");
    }

}
