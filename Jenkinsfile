pipeline {
    agent any
    axis {
       axis1 = ['a','b','c']
       axis2 = ['x','y','z']
    }
    stages {
        stage('Example 1') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Example 2') {
           axis {
              axis3 = ['1','2','3']
            }
            steps {
                echo 'Hello World'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
