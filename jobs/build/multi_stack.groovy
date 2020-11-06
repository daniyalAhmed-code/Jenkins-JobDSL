multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('develop')
        }
    }
     configure {
        it / 'triggers' << 'com.cloudbees.hudson.plugins.folder.computed.PeriodicFolderTrigger' {
            spec '* * * * *'
            interval "60000"
        }
        it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
            scriptPath("pipelines/dev.groovy")
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
