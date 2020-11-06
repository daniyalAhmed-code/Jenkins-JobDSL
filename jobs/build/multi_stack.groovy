multibranchPipelineJob('multi_test1') {
    branchSources {
        branchSource {
            source {
                github {
                    id('23232323') // IMPORTANT: use a constant and unique identifier
                    repoOwner('daniyalAhmed-code')
                    repository('Jenkins-JobDsl')

                traits {
                    gitHubBranchDiscovery {
                    // Determines which branches are discovered.
                    strategyId(1)
                    }
                    // Discovers pull requests where the origin repository is the same as the target repository.
                    gitHubPullRequestDiscovery {
                    // Determines how pull requests are discovered: Merging the pull request with the current target branch revision Discover each pull request once with the discovered revision corresponding to the result of merging with the current revision of the target branch.
                    strategyId(1)
                    }
                }
                }
    }
    configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'com.cloudbees.jenkins.plugins.bitbucket.BranchDiscoveryTrait' {
        strategyId(3) // detect all branches
      }
      traits << 'com.cloudbees.jenkins.plugins.bitbucket.OriginPullRequestDiscoveryTrait' {
      strategyId(3) // detect all PRs
    }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
    }
}

