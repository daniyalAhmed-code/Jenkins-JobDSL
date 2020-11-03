
pipelineJob('seed_sharedlib') {
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
