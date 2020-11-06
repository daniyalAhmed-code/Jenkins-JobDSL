multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
             repoOwner('daniyalAhmed-code')
            repository('Jenkins-JobDsl')
        }
    }
    configure{
         it / 'triggers' << 'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
           strategyId(1)
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}

