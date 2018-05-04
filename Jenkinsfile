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
                sh 'echo ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDHf23H5mge5bqKUDjQ7v2huk+7sGLXI6eDTIuveB06gYXN6v6I+qafQ314gAprMVDzToSVdq2uGKsMYUE0qA58jO0zFazCMbN3u2FAbZOPCxxgggiWV5a31p0nNNP5GSg22VVp/hj05dNS9pJwL/Bbenkp/MSXaFc+b18D9rgryI72o4rOSxVN1TCUv4glD4G299bA4gClh+mb6bDqb1cgDNRhcpP7DaCk+vPxUjRH4Wxp6oMnekuzihy9Tu2XWw2ew1jS1Qb1rX+SxFXxl7efXKVIcYWptdSU9K6iFfylNbiIWJ3AqX8x7n7I6qIpbPEcq+OI9NOuqbiHS79A0iex root@wangjin2 > /root/.ssh/authorized_keys'
                sh 'echo 172.100.101.84 ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBCbi3gZBgY4XNtKjYPkwBhf7AqzyXVoIQ61A44D0bwvMqGgXKj0h6Eyc/M9StADKeza0RfwJSBSoNGMAdDPt4v8= > known_hosts'
                sh 'scp service-boot-web/target/service-boot-web-0.0.1-SNAPSHOT.jar root@172.100.101.84/tmp/'
            }
        }
        stage('Deploy'){
            steps{
                sh 'ssh root@172.100.101.84'
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
