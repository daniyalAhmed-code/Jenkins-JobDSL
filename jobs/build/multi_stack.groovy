multibranchPipelineJob('multi_test1') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote ('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
             includes('develop')
        }
    }
    
  
    factory {
        workflowBranchProjectFactory {
               scriptPath("pipeline/PrintText2.groovy")
    }
    }
     configure {
        it / sources / 'data' / 'jenkins.branch.BranchSource' << {
            source(class: 'jenkins.plugins.git.GitSCMSource') {
                id(uuid)
                remote("https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git")
                includes('*')
                excludes('')
                ignoreOnPushNotifications('false')
                traits {
                    'jenkins.plugins.git.traits.BranchDiscoveryTrait'()
                }
            }
            // default strategy when sourcing from a branch
            strategy(class: "jenkins.branch.NamedExceptionsBranchPropertyStrategy") {
                defaultProperties(class: "java.util.Arrays\$ArrayList") {
                    a(class: "jenkins.branch.BranchProperty-array") {
                        // don't trigger builds
                        "jenkins.branch.NoTriggerBranchProperty"()
                    }
                }
                // exceptions to the default strategy
                namedExceptions(class: "java.util.Arrays\$ArrayList") {
                    a(class: "jenkins.branch.NamedExceptionsBranchPropertyStrategy\$Named-array") {
                        "jenkins.branch.NamedExceptionsBranchPropertyStrategy_-Named"() {
                            // for the brach named `master` trigger builds 
                            //   (this is default behaviour if no branch properties are specified)
                            props(class: "empty-list")
                            name("master")
                        }
                    }
                }
            }
        }
     }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
