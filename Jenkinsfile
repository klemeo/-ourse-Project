pipeline {
    agent {
        docker {
            image 'klemeo/otus'
            args '-it --memory=12g --cpus="4" -u root'
        }
    }
    stages {
        stage("init") {
            steps {
                script {
                "chmod +x gradlew"
                }
                script {
                "./gradlew"
                }
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