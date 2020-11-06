multibranchPipelineJob('job name') {
    branchSources {
        branchSource {
            source {
                git {
                    remote('https://github.com/daniyalAhmed-code/Jenkins-JobDSL.git')
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
    triggers {
        periodic(2) // Trigger every 2 min.
    }
    orphanedItemStrategy { discardOldItems { numToKeep(-1) } }
}
    