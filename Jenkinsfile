@Library('test-shared-lib')_
pipeline {
    agent any

    stages {
        stage('Slack it'){
            post {
            always {
            script {
                BUILD_USER = getBuildUser()
            }
            echo 'I will always say hello in the console.'
            slackSend channel: '#slack-test-channel',
                 message: 'Hello, world'
        }
    }
        }
    }
}

