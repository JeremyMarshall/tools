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
                        scanForIssues tool: pyLint()
                        publishIssues issues: [pylint]
                    }
                }
        //    }
        //}
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
            // recordIssues outputs: [githubPullRequestComment()], tools: [pyLint()]
        }
    }
}
