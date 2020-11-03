@Library('test-shared-lib')_
def getVar() {
  echo "HEllo world from jenkinsfile"
}

utils(this.&getVar)


stage('Print Build Info') {
   utils.set_virtual_env()
} stage('Disable balancer') {
   echo ""
} stage('Deploy') {
    deploy()
} stage('Enable balancer') {
    enableBalancerUtils()
} stage('Check Status') {
    checkStatus()
}