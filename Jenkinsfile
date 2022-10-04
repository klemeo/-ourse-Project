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
                    echo "chmod +x gradlew"
                    echo "./gradlew"
                }
            }
        }
        stage("build") {
            steps {
                script {
                 echo "./gradlew assembleDebug"
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