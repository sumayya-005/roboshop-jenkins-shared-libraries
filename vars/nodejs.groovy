def call() {
    node {

        common.codeQuality()

        if ( BRANCH_NAME == "main" || tag ==~ ".*" ) {
            stage ('Style Checks') {
                echo 'Style Checks'
            }
        }
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


