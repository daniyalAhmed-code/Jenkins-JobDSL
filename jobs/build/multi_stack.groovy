    multibranchPipelineJob("my_awesome_job") {
    displayName "my awesome job"
    description "multi-branch pipeline job thingy"
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
        // customise the branch project factory
        it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
            // pipeline jobs will have their script path set to `pipelines/customPipeline.groovy`
            scriptPath("Jenkinsfile")
        } 
    }
}
   