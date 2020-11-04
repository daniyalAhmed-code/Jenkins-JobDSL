multibranchPipelineJob('multi_test') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('*')
            excludes('main')
        }
    }
    factory {
        workflowBranchProjectFactory {
               scriptPath("pipeline/PrintText2.groovy")
    }
    }
    
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
