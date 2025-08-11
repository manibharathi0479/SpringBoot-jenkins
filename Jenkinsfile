pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                deleteDir()
                bat "git clone https://github.com/manibharathi0479/SpringBoot-jenkins.git"
                dir('SpringBoot-jenkins') {
          // -B = batch mode (less interactive logs), adjust to mvnw if available
                bat 'mvn -B clean package'
        }
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
