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
       stage('performance test')
       {
           steps
           {blazeMeterTest abortJob: true, credentialsId: '991f7aeb-7247-4c76-881f-7bc04a941ff7', getJtl: true, getJunit: true, testId: '7425390.taurus', workspaceId: '390580'
           }
       }
   }
}

