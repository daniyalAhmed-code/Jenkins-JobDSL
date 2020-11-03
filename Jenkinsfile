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