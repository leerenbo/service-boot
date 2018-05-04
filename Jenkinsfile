pipeline {
    agent {
        docker {
            image 'leerenbo/git-java10-maven-ssh'
            args '-p 8080:8080'
        }
    }
    environment {
        CI = 'true'
    }
    stages {
        stage('Prepare') {
            steps {
                sh 'mkdir -p ~/.m2/'
                sh 'cp jenkins/settings.xml ~/.m2/'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn package -Dmaven.test.skip=true'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn surefire:test'
            }
        }
        stage('Delivery') {
            steps {
                sh ''
            }
        }
        stage('Deploy'){
            steps{
                sh ''
            }
        }
    }
}
