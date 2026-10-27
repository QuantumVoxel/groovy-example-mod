package org.example.client

import net.fabricmc.api.ClientModInitializer
import org.example.ExampleMod

class ExampleModClient implements ClientModInitializer {
    @Override
    void onInitializeClient() {
        ExampleMod.LOGGER.info("Hello from Client!")
    }
}
