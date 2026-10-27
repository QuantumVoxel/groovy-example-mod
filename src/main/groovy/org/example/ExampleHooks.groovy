package org.example

class ExampleHooks {
    static def onCommonInit() {
        ExampleMod.LOGGER.info("Hello from Mixin!")
    }
}
