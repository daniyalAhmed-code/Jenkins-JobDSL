@Library('test-shared-lib')_
def getVar() {
  echo "HEllo world from jenkinsfile"
}
stage('Print Build Info') {
    utils(this.&getVar)
} 
stage("Static method test"){
     utils.call("this is a heloo world")
}