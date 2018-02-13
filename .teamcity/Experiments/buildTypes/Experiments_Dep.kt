package Experiments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Experiments_Dep : BuildType({
    uuid = "b3e9a7c7-0f40-4bc0-8e96-2d373ef0a0aa"
    extId = "Experiments_Dep"
    name = "Dep"

    params {
        param("debug_number", "")
    }

    steps {
        script {
            name = "Debug"
            scriptContent = """
                echo "%debug_number%"
            """.trimIndent()
        }
    }
})
