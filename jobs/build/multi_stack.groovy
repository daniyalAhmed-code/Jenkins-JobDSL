multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('*')
        }
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
