package Experiments.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot


object Experiments_HttpsGithubComBigaltumTeamcityDebugGit : GitVcsRoot({
    uuid = "c1c9d8b1-4a44-47ea-b48a-d0b2269a43ac"
    extId = "Experiments_HttpsGithubComBigaltumTeamcityDebugGit"
    name = "https://github.com/bigaltum/teamcity_debug.git"
    url = "https://github.com/bigaltum/teamcity_debug.git"
    branchSpec = "+:*"
    authMethod = anonymous()
})