pipeline{
    agent any

    stages{
        stage('Compile'){
            steps{
               withMaven(jdk: 'JDK_Jenkins', maven: 'Maven_Jenkins') {
                    sh 'mvn clean compile'
                }
            }
        }
         stage('Testing'){
                    steps{
                       withMaven(jdk: 'JDK_Jenkins', maven: 'Maven_Jenkins') {
                            sh 'mvn test'
                        }
                    }
                }
                 stage('Deployment'){
                            steps{
                                withMaven(jdk: 'JDK_Jenkins', maven: 'Maven_Jenkins') {
                                    sh 'mvn deploy'
                                }
                            }
                        }
    }
}
