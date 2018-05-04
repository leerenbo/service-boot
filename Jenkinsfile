pipeline {
    agent {
        docker {
            image 'leerenbo/git-java10-maven-ssh'
            args '--mount type=bind,source=/root/.m2,target=/root/.m2'
        }
    }
    stages {
        stage('Prepare') {
            steps {
                sh 'echo Prepare'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install -U -B -e'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        stage('Delivery') {
            steps {
                sh 'echo Delivery'
            }
        }
        stage('Deploy'){
            steps{
                sh 'echo Deploy'
            }
        }
    }
}
