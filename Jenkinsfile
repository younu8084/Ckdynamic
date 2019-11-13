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
    blazeMeterTest credentialsId: '066244b3-2b67-4823-854d-4caccd20a1f8', getJtl: true, getJunit: true, testId: '7420370.functionalApi', workspaceId: '389232'
    }
    }
       stage('perfiormance test')
       {
           steps
           {
               blazeMeterTest credentialsId: '96db6bdb-8801-4d2d-ba2f-7d3a32c8d575', getJunit: true, testId: '7420132.taurus', workspaceId: '389431'
           }
      }
}

