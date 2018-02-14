package Experiments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

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

    params {
        param("debug_value", "")
    }

    vcs {
        root(Experiments.vcsRoots.Experiments_HttpsGithubComBigaltumTeamcityDebugGit)

        checkoutMode = CheckoutMode.MANUAL
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            triggerRules = ""
            branchFilter = ""
        }
    }
})
