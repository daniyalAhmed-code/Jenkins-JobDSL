pipelineJob('seed_sharedlib') {

    logRotator {
      numToKeep(10)
    }

    definition {
      cps {
        script('''

node('master') {
  println "Get shared library configuration from file..."
  }
        ''')
        sandbox(true)
      }
    }
}
