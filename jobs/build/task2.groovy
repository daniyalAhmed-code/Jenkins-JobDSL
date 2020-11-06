multibranchPipelineJob('Dev_task2') {
    branchSources {
        git {
            id('12df-34e-56a-7b89') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('*')
            excludes('main')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}