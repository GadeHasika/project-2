pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Hello World'
               bat 'javac Factorial.java'
              bat 'java Factorial'
            }
        }
    }
}
