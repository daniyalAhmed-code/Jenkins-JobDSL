@Library('test-shared-lib')_
pipeline {
    agent any

    stages {
        stage('Slack it'){
            steps {
                slackSend channel: '#slack-test-channel', 
                          message: 'Hello, world'
            }
            post {
        always {
            script {
            echo 'I will always say hello in the console.'
           
             }
            slackSend channel: '#slack-test-channel',
                 message: 'Hello, world'
        }
    }
        }
    }
}

