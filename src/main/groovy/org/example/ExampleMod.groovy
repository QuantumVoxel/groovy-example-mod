package org.example

import net.fabricmc.api.ModInitializer
import net.quantumvoxel.util.Key
import org.example.init.ModBlocks
import org.example.init.ModItems
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod implements ModInitializer {
    final static String MOD_ID = "examplemod"
    final static Logger LOGGER = LoggerFactory.getLogger('ExampleMod')

    @Override
    void onInitialize() {
        LOGGER.info('Hello from Fabric!')

        ModBlocks.init()
        ModItems.init()
    }

    static Key key(path) {
        return new Key(MOD_ID, String.valueOf((Object) path))
    }
}