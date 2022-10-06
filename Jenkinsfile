pipeline {
    agent {
          docker {
                image 'klemeo/otus:v.1.0.0'
                args '-it --memory=12g --cpus="4"'
          }
    }
    stages {
        stage('init') {
            steps {
                  echo 'chmod +x gradlew'
                  echo './gradlew'
            }
        }
        stage('build') {
            steps {
                 echo './gradlew assembleDebug'
            }
        }
    }
    post {
        always {
            archiveArtifacts(artifacts: '**/build/reports/**', allowEmptyArchive: true)
        }
    }
}