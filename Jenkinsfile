pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: '1')) }
    axes {
       axis1('a','b','c')
       axis2('x','y','z')
    }
    stages {
        //stage('Parallel') {
        //    parallel {
                stage('Example 1') {
                   agent any
                    //agent {
                    //    node {
                    //        label 'swarm'
                    //        customWorkspace 'example1'
                    //   }
                    //}
                    steps {
                        sh ("env|sort")
                    }
                }
                stage('Example 2') {
                   agent any
                    //agent {
                    //    node {
                    //        label 'swarm'
                    //        customWorkspace 'example2'
                    //   }
                    //}
                    axes {
                       axis3('1','2','3')
                    }
                    steps {
                        echo 'Hello World'
                    }
                }
        //    }
        //}
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
