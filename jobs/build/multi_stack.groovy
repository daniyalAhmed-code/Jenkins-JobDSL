multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
             repoOwner('daniyalAhmed-code')
            repository('Jenkins-JobDsl')
        traits {
              // discover PRs
              originPullRequestDiscoveryTrait {
                strategyId(1) //build both the head and merge refs
              }
        }
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}}

