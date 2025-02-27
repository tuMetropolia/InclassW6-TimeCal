pipeline {
    agent any
    tools {
        maven 'Tu Maven'
    }
    stages {
        stage('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/tuMetropolia/InclassW6-TimeCal.git'
            }
        }
        stage('build') {
            steps {
                sh "mvn clean install"
            }
        }
    }
}