multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
             repoOwner('daniyalAhmed-code')
            repository('Jenkins-JobDsl')
        }
    }
 
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}

