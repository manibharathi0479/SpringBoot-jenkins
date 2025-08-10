pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q SpringBoot-jenkins"
                bat "git clone https://github.com/manibharathi0479/SpringBoot-jenkins.git"
                bat "mvn clean -f SpringBoot-jenkins"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f SpringBoot-jenkins"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f SpringBoot-jenkins"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f SpringBoot-jenkins"
            }
        }
    }
}