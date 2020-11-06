multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('*')
        }
    }
   configure {
        it / 'triggers' << 'com.cloudbees.hudson.plugins.folder.computed.PeriodicFolderTrigger' {
            spec '* * * * *'
            interval "60000"
        }
        it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
            scriptPath("pipelines/prod.groovy")
        }     
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
