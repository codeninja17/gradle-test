pipeline {
    agent any

    stages {
       stage('Test') {
            parallel{
                   stage ('Test & Build Artifact - prod') {
                            steps {
                                sh './gradlew clean build -Pchannel=local'
                            }
                   }

                   stage ('Test & Build Artifact - local') {
                              steps {
                                 sh './gradlew clean build -Pchannel=prod'
                              }
                   }
            }
       }
    }
}