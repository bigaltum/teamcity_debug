package Experiments

import Experiments.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2c92a962-c865-482e-83d9-f4049a766360"
    extId = "Experiments"
    parentId = "_Root"
    name = "Experiments"

    buildType(Experiments_Run)
    buildType(Experiments_Dep)
})
