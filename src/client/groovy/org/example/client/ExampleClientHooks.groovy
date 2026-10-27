package org.example.client

import org.example.ExampleMod

class ExampleClientHooks {
    static def onTitleScreenInit() {
        ExampleMod.LOGGER.info("Hello from client Mixin!")
    }
}
