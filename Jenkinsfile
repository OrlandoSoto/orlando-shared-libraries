pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh 'echo \'multibranch\''
          }
        }
        stage('build2') {
          steps {
            git(url: 'https://github.com/OrlandoSoto/orlando-shared-libraries', branch: 'my-branch')
          }
        }
      }
    }
  }
}