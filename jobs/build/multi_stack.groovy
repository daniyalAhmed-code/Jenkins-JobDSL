multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote {
                github('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
           
            }
          
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
