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
   blazeMeterTest credentialsId: '123', getJtl: true, getJunit: true, testId: '7422490.functionalApi', workspaceId: '390025'
    }
       stage('performance test')
       {
           steps
           {blazeMeterTest credentialsId: '066244b3-2b67-4823-854d-4caccd20a1f8', getJtl: true, getJunit: true, testId: '7421221.taurus', workspaceId: '389232'
           }
      }
   }
}

