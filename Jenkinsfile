pipeline{
    agent any
    stages {
        stage('fetch_latest_code') {
        steps {
          script{
              echo 'Jenkinsfile outside'
          }
        }
      }
        stage('build') {
            steps {
                script {
                   echo 'In build as no git repo was used' 
                }
                }
            }
        }
}