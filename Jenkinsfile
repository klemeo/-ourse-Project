pipeline {
    agent {
        docker {
            image 'klemeo/otus'
            args '-it --memory=12g --cpus="4" -u root'
        }
    }
    stages {
        stage('init') {
            steps {
                script {
                    sh 'chmod +x gradlew'
                    sh './gradlew'
                }
            }
        }
        stage('build') {
            steps {
                script {
                 sh './gradlew assembleDebug'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts(artifacts: '**/build/reports/**', allowEmptyArchive: true)
        }
    }
}