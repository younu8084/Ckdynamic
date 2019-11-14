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
       blazeMeterTest abortJob: true, credentialsId: '123', getJtl: true, getJunit: true, testId: '7425256.functionalApi', workspaceId: '390025'
    }
    }
       stage('performance test')
       {
           steps
           {blazeMeterTest abortJob: false, credentialsId: '0a85930e-48e2-46b6-8586-cdaf9f5acc37', getJtl: true, getJunit: true, testId: '7425338.taurus', workspaceId: '390580'
           }
       }
   }
}

