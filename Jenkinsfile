@Library('test-shared-lib')_
pipeline {
    agent any

    stages {
        stage('Slack it'){
            steps {
               echo "Working in the Console"
            }
            post {
        always {
            utils.notifyBuild(currentBuild.result)
        }
    }
        }
    }
}

