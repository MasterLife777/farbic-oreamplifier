package net.masterlife.oreamplifier.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.masterlife.oreamplifier.OreAmplifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PIECE_OF_DEATH = registerItem("piece_of_death",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OreAmplifier.MOD_ID, name), item);
    }
    public static void registerModItems() {
        OreAmplifier.LOGGER.debug("Registering Mod Items for " + OreAmplifier.MOD_ID);
    }
}
