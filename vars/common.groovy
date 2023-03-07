def codeQuality() {
    stage('code quality') {
        echo 'code quality'
    }
}

def codeChecks() {
    if ( BRANCH_NAME == "main" || TAG_NAME ==~ ".*" ) {
        stage ('Style Checks') {
            echo 'Style Checks'
        }

        stage ('Unit Tests') {
            echo 'Unit Tests'
        }
    }
}
