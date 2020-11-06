multibranchPipelineJob('multi_test1') {
    branchSources {
        github {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote {
                url('https://github.com/ThePillClub/jenkins.git')
       
        }
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
}
