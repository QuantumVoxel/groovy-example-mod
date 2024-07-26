package com.example.craft.mod

import com.example.craft.mod.init.ModBlocks
import dev.ultreon.quantum.ModInit
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod implements ModInit {
    final static MOD_ID = "example_mod"
    final static Logger LOGGER = LoggerFactory.getLogger(MOD_ID)

    @Override
    void onInitialize() {
        ModBlocks.register()
    }
}