def call() {
    node {

        if (! env.TAG_NAME) {
            env.TAG_NAME = ""
        }
        common.codeQuality()
        common.codeChecks()


    }
}





//            stage('Style Checks') {
//                when {
//                    anyOf {
//                        branch 'main'
//                        tag "*"
//                    }
//                }
//                steps {
//                    echo 'Style Checks'
//                }
//            }
//
//            stage(' Unit Test') {
//                when {
//                    anyOf {
//                        branch 'main'
//                        tag "*"
//                    }
//                }
//
//                steps {
//                    echo ' Unit test'
//                }
//            }
//
//            stage(' Download Dependencies') {
//                when { tag "*"}
//                steps {
//                    echo 'Download Dependencies'
//                }
//            }
//
//            stage ('Prepare Artifacts') {
//                when { tag "*"}
//                steps {
//                    echo 'prepare artifacts'
//                }
//            }
//
//            stage('Publish Artifacts') {
//                when { tag "*"}
//                steps {
//                    echo 'Publish Artifacts'
//                }
//            }
//        }
//    }


