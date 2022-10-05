@Library('jenkins-shared-library')_
pipeline {
    environment {
            registry = "klemeo/otus"
            registryCredential = 'Docker'
        }
    agent any
    stages {
        stage('init') {
            steps {
                  sh 'chmod +x gradlew'
                  sh './gradlew'
            }
        }
        stage('build') {
            steps {
                 sh './gradlew assembleDebug'
            }
        }
    }
    post {
        always {
            archiveArtifacts(artifacts: '**/build/reports/**', allowEmptyArchive: true)
        }
    }
}