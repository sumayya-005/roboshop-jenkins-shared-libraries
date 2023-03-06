def codeQuality() {
    stages {
        stage('code quality') {
            steps {
                echo 'code quality'
                sh 'env'
            }
        }
    }
}