multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            getAt('https://github.com/daniyalAhmed-code/Jenkins-JobDSL.git')
       
        }
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}

