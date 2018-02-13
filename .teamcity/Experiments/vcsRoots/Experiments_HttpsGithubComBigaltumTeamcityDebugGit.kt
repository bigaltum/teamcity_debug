package Experiments.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot


object Experiments_HttpsGithubComBigaltumTeamcityDebugGit : GitVcsRoot({
    uuid = "65083fbf-2ab4-4939-9e5c-8706cd5e188c"
    extId = "Experiments_HttpsGithubComBigaltumTeamcityDebugGit"
    name = "https://github.com/bigaltum/teamcity_debug.git"
    url = "https://github.com/bigaltum/teamcity_debug.git"
    branchSpec = "+:*"
    authMethod = AuthMethod.Anonymous()
})