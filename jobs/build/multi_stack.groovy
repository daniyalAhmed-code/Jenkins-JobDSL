multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('develop')
        }
    }
    
  
    factory {
        workflowBranchProjectFactory {
               scriptPath("pipeline/PrintText2.groovy")
    }
    }
     configure {
    def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.BranchDiscoveryTrait' {
     strategyId(1) // detect all branches -refer the plugin source code for various options
    }
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.ForkPullRequestDiscoveryTrait' {
     strategyId(1)
    }
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.OriginPullRequestDiscoveryTrait' {
     strategyId(1)
    }
    traits << 'com.cloudbees.jenkins.plugins.bitbucket.WebhookRegistrationTrait' {
      mode(ITEM)
    }
  }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
