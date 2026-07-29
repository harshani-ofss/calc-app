pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
               git branch : 'main',
               url : 'https://github.com/harshani-ofss/calc-app.git'
            }
        }
        stage('Build') {
            steps {
               bat 'mvn clean compile'
            }
        }
        stage('Testing') {
            steps {
               bat 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
               bat 'mvn clean package'
            }
        }
    }
    post{
        success{
            echo 'Build completed successfully!'
        }
        failure{
            echo 'Build failed!'
        }
    }
}
