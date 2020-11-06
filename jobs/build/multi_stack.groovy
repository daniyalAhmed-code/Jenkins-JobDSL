multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('*')
        }
    }
  configure {
    def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.BranchDiscoveryTrait' {
      strategyId(1)
    }
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.OriginPullRequestDiscoveryTrait' {
      strategyId(1)
    }
  }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
