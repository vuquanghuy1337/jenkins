pipeline {
    agent any  
     stages {
        stage('Example-2') {
            steps {
                shell ('echo Hello')
            }
        }
    }
}
