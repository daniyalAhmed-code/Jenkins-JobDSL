@Library('test-shared-lib')_
def consul = new Utils()

def getVar() {
  echo "HEllo world from jenkinsfile"
}
stage('Print Build Info') {
    utils(this.&getVar)
} 
stage("Static method test"){
     consul.test(this.&getVar)
}