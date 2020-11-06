multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
             repoOwner('daniyalAhmed-code')
            repository('Jenkins-JobDsl')
        
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

