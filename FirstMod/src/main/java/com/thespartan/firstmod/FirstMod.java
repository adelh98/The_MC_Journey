package com.thespartan.firstmod;

import com.thespartan.firstmod.registry.ModBlocks;
import com.thespartan.firstmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class FirstMod implements ModInitializer {

    public static final String MOD_ID = "firstmod";

    //Lager en item gruppering som legger til valgte items en egen tab i creative menyen.
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.RUBY));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "other"))
            .icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(new ItemStack(ModItems.RUBY));
                stacks.add(new ItemStack(Items.GLOWSTONE_DUST));
    })
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();   //Calls "registerItems" in "ModItems.java"
        ModBlocks.registerBlocks(); //Calls "registerBlocks" in "ModBlocks.java"
    }
}
