@Library('test-shared-lib')_
pipeline {
    agent any

    stages {
        stage('Slack it'){
            steps {
                slackSend channel: '#slack-jenkins-testing', 
                          message: 'Hello, world'
            }
            post {
        always {
            script {
            echo 'I will always say hello in the console.'
           
             }
            slackSend channel: '#slack-jenkins-testing',
                 message: 'Hello, world'
        }
    }
        }
    }
}

