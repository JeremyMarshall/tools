pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: '10')) }
    // axes {
    //    axis1('a','b','c')
    //    axis2('x','y','z')
    // }
    stages {
        //stage('Parallel') {
        //    parallel {
                stage('Example 1') {
                   environment { 
                       CC = 'clang'
                   }
                   agent any
                    //agent {
                    //    node {
                    //        label 'swarm'
                    //        customWorkspace 'example1'
                    //   }
                    //}
                    steps {
                        sh ("env|sort")
                        sh ("pylint --rcfile=./pylintrc *.py |tee  pylint.log")
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
                    // axes {
                    //    axis3('1','2','3')
                    // }
                    steps {
                        sh ("env|sort")
                    }
                }
        //    }
        //}
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
            recordIssues outputs: [githubPullRequestComment()], tools: [pyLint()]
        }
    }
}
