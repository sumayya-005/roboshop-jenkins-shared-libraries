def codeQuality() {
    stage('code quality') {
        echo 'code quality'
    }
}

def styleChecks() {
    if ( BRANCH_NAME == "main" || TAG_NAME ==~ ".*" ) {
        stage ('Style Checks') {
            echo 'Style Checks'
        }
    }
}
