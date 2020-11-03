pipelineJob('example2') {
  definition {
    cpsScm {
      scm {
           git {
          remote {
                url('https://github.com/daniyalAhmed-code/Jenkins-JobDSL.git')
            }
        }
      }
         scriptPath("pipeline/PrintText2.groovy")
      }
     cps {
        script(''' 
       publishers {
          downstreamParameterized {
            trigger('seed_sharedlib') {
              
            }
          }
        }
        ''') 
     
    }
  }
