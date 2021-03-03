package com.thespartan.firstmod.registry;

import com.thespartan.firstmod.FirstMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    /** Items **/

    // Defines what category the new item is to be placed into.
    public static final Item RUBY = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));

    /** Block Items **/
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(FirstMod.ITEM_GROUP));


    // Defines the in-game name of the item
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
