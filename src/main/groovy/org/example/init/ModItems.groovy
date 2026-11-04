package org.example.init

import net.quantumvoxel.block.Block
import net.quantumvoxel.item.BlockItem
import net.quantumvoxel.item.Item
import net.quantumvoxel.item.category.ItemCategories
import net.quantumvoxel.item.category.ItemCategory
import net.quantumvoxel.registry.Registries
import org.example.ExampleMod

class ModItems {
    static def EXAMPLE_BLOCK = register("example_block", new BlockItem(new Item.Settings(), () -> ModBlocks.EXAMPLE_BLOCK))

    private static <T extends Item> T register(name, T block) {
        Registries.ITEM.register(ExampleMod.key(name), block)
        return block
    }

    static void init() {
        ItemCategories.BUILDING.addContent(EXAMPLE_BLOCK)
    }
}
