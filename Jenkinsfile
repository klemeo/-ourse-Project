pipeline {
    agent {
          docker {
                image 'klemeo/otus:v.0.0.6'
                args '-it --memory=12g --cpus="4"'
          }
    }
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