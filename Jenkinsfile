@Library('test-shared-lib')_
ppipeline {
    agent any

    stages {
        stage('Slack it'){
            steps {
                slackSend channel: '#slack-test-channel', 
                          message: 'Hello, world'
            }
        }
    }
}

