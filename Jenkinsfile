pipeline {
    agent any

    stages {
    parallel{

    stage ('Test & Build Artifact - *******') {
                steps {
                    sh './gradlew clean build -Pchannel=prod'
                }
            }

            stage ('Test & Build Artifact - *******') {
                        steps {
                            sh './gradlew clean build -Pchannel=local'
                        }
                    }
    }
    }
}