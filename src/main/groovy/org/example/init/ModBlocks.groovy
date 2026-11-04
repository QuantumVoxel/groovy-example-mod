package org.example.init

import net.quantumvoxel.block.Block
import net.quantumvoxel.registry.Registries
import org.example.ExampleMod

class ModBlocks {
    static def EXAMPLE_BLOCK = register("example_block", new Block(new Block.Settings().strength(1.5f)))

    private static <T extends Block> T register(name, T block) {
        Registries.BLOCK.register(ExampleMod.key(name), block)
        return block
    }

    static void init() {

    }
}
