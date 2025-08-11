pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                deleteDir()
                bat "git clone https://github.com/manibharathi0479/SpringBoot-jenkins.git"
            }
        }
         stage('Build (package)') {
            steps {
                dir('SpringBoot-jenkins') {
          // -B = batch mode (less interactive logs), adjust to mvnw if available
                 bat '.\\mvnw.cmd -B clean package'
        }
      }
    }
        stage('test') {
            steps {
                 dir('SpringBoot-jenkins') {
                bat '.\\mvnw.cmd test'
                 }
            }
        }
      
    }
}
