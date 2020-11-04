multibranchPipelineJob('multi-test') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('develop')
            excludes('main')

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

