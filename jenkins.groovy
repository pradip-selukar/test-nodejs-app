pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git credentialsId: '0771278a-4ae5-45d6-95ad-22781f9785d4', url: 'https://gitlab.com/prasad-deo/cbz-student-ui.git'
                sh 'ls'
            }
        }
        stage('Build') {
            steps {
                echo 'code is Building'
                 sh 'mvn clean package'
            
        }
    }
}