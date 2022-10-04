#!groovy
pipeline {
    agent {
        docker {
            image 'otus'
            args '-it --memory=12g --cpus="4" -u root'
        }
    }
    stages {
    stage('clone') {
                steps {
                    checkout([
                        $class: 'GitSCM',
                        branches: [[name: '*/main']],
                        extensions: [],
                        userRemoteConfigs: [[url: 'https://github.com/klemeo/Course-Project.git']]
                    ])
                }
            }
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