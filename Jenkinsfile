pipeline
{
    agent any
    
    
    
    tools{
    maven 'Maven'
    }
    
   stages{
    stage('Build')
        {
            steps{
              sh 'mvn clean install'
                 }
         }
       stage('functional test')
    {
    steps
    {
      blazeMeterTest abortJob: true, credentialsId: 'NEWONE', getJtl: true, getJunit: true, testId: '7425961.functionalGui', workspaceId: '390025'
    }
    }
      
   }
}

