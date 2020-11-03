
pipelineJob('seed_sharedlib') {
    definition {
      cps {
        script('''
echo " Generating files from scract"
        ''')
        sandbox(true)
      }
    }
}
