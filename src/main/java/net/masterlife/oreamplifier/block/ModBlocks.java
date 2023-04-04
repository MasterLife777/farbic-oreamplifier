package net.masterlife.oreamplifier.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.masterlife.oreamplifier.OreAmplifier;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DEATH_BLOCK = registerBlock("death_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.DARK_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block DEATH_ORE = registerBlock("death_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f),
                    UniformIntProvider.create(3, 7)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(OreAmplifier.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return  Registry.register(Registry.ITEM, new Identifier(OreAmplifier.MOD_ID, name),
              new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
    public static void registerModBlocks() {
        OreAmplifier.LOGGER.debug("Registering ModBlocks for " + OreAmplifier.MOD_ID);
    }
}
