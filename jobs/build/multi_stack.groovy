// multibranchPipelineJob('multi_test1') {
//     branchSources {
//         git {
//             id('123456789') // IMPORTANT: use a constant and unique identifier
//             remote {
//                 github('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
//                 refspec('+refs/pull/*:refs/remotes/origin/pr/*')
//             }
//           branch('${sha1}')
//         }
//     }
//      triggers {
//         pullRequest {
//             admin('user_1')
//             triggerPhrase('OK to test')
//             onlyTriggerPhrase()
//             useGitHubHooks()
//             permitAll()
//             autoCloseFailedPullRequests()
//             displayBuildErrorsOnDownstreamBuilds()
//             whiteListTargetBranches(['develop','devTest'])
//             allowMembersOfWhitelistedOrgsAsAdmin()
//             extensions {
//                 commitStatus {
//                     context('deploy to staging site')
//                     triggeredStatus('starting deployment to staging site...')
//                     startedStatus('deploying to staging site...')
//                     addTestResults(true)
//                     completedStatus('SUCCESS', 'All is well')
//                 }
//             }
//         }
//     }
//     publishers {
//         mergeGithubPullRequest {
//             mergeComment('merged by Jenkins')
//             onlyAdminsMerge()
//         }
//     }

//     factory {
//         workflowBranchProjectFactory {
//                scriptPath("pipeline/PrintText2.groovy")
//     }
//     }
    
    
//     orphanedItemStrategy {
//         discardOldItems {
//             numToKeep(2)
//         }
//     }
// }
