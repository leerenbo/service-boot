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
    post {
        always {
            junit 'service-boot-web/target/surefire-reports/*.xml'
        }
    }
}
