multibranchPipelineJob('multi_test') {
    branchSources {
        git {
            id('12-34ab-56fe-789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('*')
            excludes('devTest|main')
        }
    }
    factory {
        workflowBranchProjectFactory {
               scriptPath("pipeline/PrintText.groovy")
    }
    }
    
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}