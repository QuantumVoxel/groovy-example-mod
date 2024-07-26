package com.example.craft.mod.init


import com.example.craft.mod.ExampleMod
import dev.ultreon.quantum.block.Block
import dev.ultreon.quantum.registry.DeferRegistry
import dev.ultreon.quantum.registry.Registries

class ModBlocks {
    private static final REGISTER = DeferRegistry.of ExampleMod.MOD_ID, Registries.BLOCK

    static final EXAMPLE_BLOCK = REGISTER.defer "example_block", { new Block() }

    static void register() {
        REGISTER.register()
    }
}
