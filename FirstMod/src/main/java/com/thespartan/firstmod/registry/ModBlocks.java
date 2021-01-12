package com.thespartan.firstmod.registry;

import com.thespartan.firstmod.FirstMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Define new block in the game. Fabric = Block settings and material
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.
            of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Mining level 2 = Iron Pickaxe or better.
            .requiresTool()
            .strength(5f,30f) //Defines the strength of the block.
            .sounds(BlockSoundGroup.METAL) //Defines the sound the block made when interacted with (Walking, etc)
            );

    //Registers block to the game.
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
