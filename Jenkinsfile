pipline{
    agent any

    stages{
        stage('Compile'){
            steps{
                withMaven(maven :maven 'maven_3_5_2'){
                    bh 'mvn clean compile'
                }
            }
        }
         stage('Testing'){
                    steps{
                        withMaven(maven :maven 'maven_3_5_2'){
                            sh 'mvn test'
                        }
                    }
                }
                 stage('Deployment'){
                            steps{
                                withMaven(maven :maven 'maven_3_5_2'){
                                    sh 'mvn deploy'
                                }
                            }
                        }
    }
}