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
                sh 'mkdir -p /root/.ssh/'
                sh 'cp jenkins/id_rsa /root/.ssh/'
                sh 'chmod 700 ~/.ssh'
                sh 'chmod 600 ~/.ssh/id_rsa'
                input "Does the staging environment look ok?"
                sh 'scp service-boot-web/target/service-boot-web-0.0.1-SNAPSHOT.jar root@172.100.101.84/tmp/'
            }
        }
        stage('Deploy'){
            steps{
                sh 'ssh -o StrictHostKeyChecking=no root@172.100.101.84'
                sh 'docker rm -f service-boot-web'
                sh 'docker run -d -p 8080:8080 -name service-boot-web --mount type=bind,source=/tmp/service-boot-web-0.0.1-SNAPSHOT.jar,target=/opt/jenkinsapp/service-boot-web-0.0.1-SNAPSHOT.jar leerenbo/git-java10-maven-ssh java -jar /opt/jenkinsapp/service-boot-web-0.0.1-SNAPSHOT.jar'
            }
        }
    }
    post {
        always {
            junit 'service-boot-web/target/surefire-reports/*.xml'
        }
    }
}
