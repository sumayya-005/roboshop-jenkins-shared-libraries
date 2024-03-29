def codeCheckout() {
    stage('Code Checkout') {
        sh 'find . | sed 1d |xargs rm -rf'
            git branch: 'main', url: "https://github.com/sumayya-005/${COMPONENT}.git"
    }
}



def codeQuality() {
    stage('code quality') {
//        withCredentials([usernamePassword(credentialsId: 'SONAR', passwordVariable: 'sonarPass', usernameVariable: 'sonarUser')]) {
//
//            sh '''
//           #sonar-scanner -Dsonar.host.url=http://172.31.9.105:9000 -Dsonar.login=${sonarUser} -Dsonar.password=${sonarPass} -Dsonar.projectKey=${COMPONENT} -Dsonar.qualitygate.wait=true ${SONAR_EXTRA_OPTS}
//            echo OK
//         '''

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


//def artifacts() {
//    if (env.TAG_NAME ==~ ".*") {
//
//        stage()
//        stage('Prepare Artifacts') {
//            if (env.APPTYPE == "nodejs") {
//                sh '''
//          npm install
//          #zip -r ${COMPONENT}-${TAG_NAME}.zip node_modules server.js
//        '''
//            }
//            if (env.APPTYPE == "java") {
//                sh '''
//          mvn clean package
//          mv target/${COMPONENT}-1.0.jar ${COMPONENT}.jar
//          #zip -r ${COMPONENT}-${TAG_NAME}.zip ${COMPONENT}.jar
//        '''
//            }
//            if (env.APPTYPE == "python") {
//                sh '''
//          #zip -r ${COMPONENT}-${TAG_NAME}.zip *.py ${COMPONENT}.ini requirements.txt
//        '''
//            }
//            if (env.APPTYPE == "nginx") {
//                sh '''
//          #cd static
//          #zip -r ../${COMPONENT}-${TAG_NAME}.zip *
//        '''
//            }
//        }
//
//        stage('Build Docker Image') {
//            sh '''
//               docker build .
//            '''
//        }
//
//        stage('Publish Artifacts') {
//            withCredentials([usernamePassword(credentialsId: 'NEXUS', passwordVariable: 'nexusPass', usernameVariable: 'nexusUser')]) {
//                sh '''
//          curl -v -u ${nexusUser}:${nexusPass} --upload-file ${COMPONENT}-${TAG_NAME}.zip http://nexus.roboshop.internal:8081/repository/${COMPONENT}/${COMPONENT}-${TAG_NAME}.zip
//        '''
//            }
//        }
//
//    }
//}




