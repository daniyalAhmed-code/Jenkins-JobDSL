<<<<<<< HEAD
// multibranchPipelineJob('multi_test') {
//     branchSources {
//         git {
//             id('123456789') // IMPORTANT: use a constant and unique identifier
//             remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
//             includes('develop')
//             excludes('main')
=======


multibranchPipelineJob('multi_test') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/Jenkins-JobDsl.git')
            includes('develop')
            excludes('main')
>>>>>>> c69197d73d859281f471c795d060bb55d46f1636

//         }
//     }
//     factory {
//         workflowBranchProjectFactory {
//                scriptPath("pipeline/PrintText.groovy")
//     }
//     }
    
<<<<<<< HEAD
//     orphanedItemStrategy {
//         discardOldItems {
//             numToKeep(2)
//         }
//     }
// }
=======

  
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}
>>>>>>> c69197d73d859281f471c795d060bb55d46f1636

