#!groovy
pipeline {
    agent {
        docker {
            image 'android_otus'
            args '-it --memory=12g --cpus="4"'
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
        stage("init") {
            steps {
                sh "chmod +x gradlew"
                sh "./gradlew"
            }
        }
        stage("lint") {
            steps {
                 sh "./gradlew lintDebug"
            }
        }
        stage("test") {
            steps {
                  sh "./gradlew testDebugUnitTest"
            }
        }
        stage("build") {
            steps {
                  sh "./gradlew assembleDebug"
            }
        }
    }
    post {
        always {
            archiveArtifacts(artifacts: '**/build/reports/**', allowEmptyArchive: true)
        }
    }
}