multibranchPipelineJob('multi-test') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/daniyalAhmed-code/jenkins-Jcasc.git')
            includes('*')
            excludes('main')
        }
    }
    configure {
            scriptPath("pipelines/PrintText.groovy")
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(2)
        }
    }
}

