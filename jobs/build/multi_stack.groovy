multibranchPipelineJob('multi_test1') {
   branchSources {
        branchSource {
            source {
                git {
                    remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
                }
            }
            strategy {
                defaultBranchPropertyStrategy {
                    props {
                        noTriggerBranchProperty()
                    }
                }
            }
        }
    }
    configure {
        def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
        traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
    }
    
    orphanedItemStrategy { discardOldItems { numToKeep(-1) } }
}
   
   
    