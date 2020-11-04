multibranchPipelineJob('multi-test') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/jenkinsci/job-dsl-plugin.git')
            credentialsId('github-ci')
            includes('*')
            excludes('main')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}

