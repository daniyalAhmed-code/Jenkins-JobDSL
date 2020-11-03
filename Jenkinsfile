// @Library('test-shared-lib')_
// def getVar() {
//   echo "HEllo world from jenkinsfile"
// }
// stage('Print Build Info') {
//     utils(this.&getVar)
// } 
// stage("Static method test"){
//      utils.test(this.&getVar)
// }

@Library('test-shared-lib')_
import classes.Tester 

stages{
    stage('Demo') {  
      steps{
        echo 'Hello world'
        sayHello 'test'
       script{
        def t = new Tester('Alice')
        t.sayHi()
       }
      }
   }
 }  