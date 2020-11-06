multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('adeaf87d-d896-48ea-b207-fc3f755a9ecc')
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('develop')
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
