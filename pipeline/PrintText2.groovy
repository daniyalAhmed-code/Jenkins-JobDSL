   pipeline("testing"){
   definition{ cps {
      script("""
       pipeline {
    agent any
    stages {
        stage('building') {
            steps {
                echo "in building phase"
            }
        }
        stage('built') {
            steps {
                echo "why is it called a building when its already built"
            }
        } 
    }
}
      """.stripIndent())
    }
  }
}