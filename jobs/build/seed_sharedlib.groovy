def call(Map config=[:], Closure body) {
    node {
        stage("Install") {
            echo "installing nodejs"
        }
        stage("Test") {
            echo "testing nodejs"
        }
        stage("Deploy") {
            if (config.deploy) {
                echo "deploying nodejs"
            }
        }
        body()
    }
}