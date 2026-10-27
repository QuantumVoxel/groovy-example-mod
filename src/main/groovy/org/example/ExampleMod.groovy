package org.example

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod implements ModInitializer {
    final static Logger LOGGER = LoggerFactory.getLogger('ExampleMod')

    @Override
    void onInitialize() {
        LOGGER.info('Hello from Fabric!')
    }
}