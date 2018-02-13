package Experiments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Experiments_Run : BuildType({
    uuid = "08806c58-4c9e-47a3-8079-c524ae236b66"
    extId = "Experiments_Run"
    name = "Run"
    dependencies {
        dependency(Experiments_Dep) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
