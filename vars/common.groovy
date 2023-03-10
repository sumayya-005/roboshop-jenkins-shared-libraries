def codeQuality() {
    stage('code quality') {

        sh ''' 
           sonar-scanner -Dsonar.host.url=http://172.31.10.56:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=${COMPONENT} -Dsonar.qualitygate.wait=true ${SONAR_EXTRA_OPTS}
         '''
    }
}

def codeChecks() {
    if ( env.BRANCH_NAME == "main" || env.TAG_NAME ==~ ".*" ) {
        stage ('Style Checks') {
            echo 'Style Checks'
        }

        stage ('Unit Tests') {
            echo 'Unit Tests'
        }
    }
}


def artifacts() {
    if ( env.TAG_NAME ==~ ".*" ) {
        stage(' Download Dependencies') {
            echo 'Download Dependencies'
        }

        stage('Prepare Artifacts') {
            echo 'Prepare Artifacts'
        }

        stage('Publish Artifacts') {
            echo 'Publish Artifacts'
        }
    }

}
