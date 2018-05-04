pipeline {
    agent {
        docker {
            image 'leerenbo/git-java10-maven-ssh'
            args '--mount type=bind,source=/root/.m2,target=/root/.m2 --mount type=bind,source=/var/run/docker.sock,target=/var/run/docker.sock'
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
                sh 'docker rm -f service-boot-web'
                sh 'docker run -d -p 8080:8080 -name service-boot-web --mount type=bind,source=service-boot-web/target/,target=/opt/jenkinsapp/ leerenbo/git-java10-maven-ssh java -jar /opt/jenkinsapp/service-boot-web-0.0.1-SNAPSHOT.jar'
            }
        }
    }
    post {
        always {
            junit 'service-boot-web/target/surefire-reports/*.xml'
        }
    }
}
