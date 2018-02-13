package Experiments

import Experiments.buildTypes.*
import Experiments.vcsRoots.Experiments_HttpsGithubComBigaltumTeamcityDebugGit
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "2c92a962-c865-482e-83d9-f4049a766360"
    extId = "Experiments"
    parentId = "_Root"
    name = "Experiments"

    buildType(Experiments_Run)
    buildType(Experiments_Dep)

    vcsRoot(Experiments_HttpsGithubComBigaltumTeamcityDebugGit)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = Experiments_HttpsGithubComBigaltumTeamcityDebugGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }

})
