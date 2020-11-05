job('example') {
    scm {
        git {
            remote {
                github('daniyalAhmed-code/Jenkins-JobDsl')
                refspec('+refs/pull/*:refs/remotes/origin/pr/*')
            } 
            branch('${sha1}')
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