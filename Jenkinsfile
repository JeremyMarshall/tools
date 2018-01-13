pipeline {
    agent any
    matrix {
        axis {
           axis1 = ['a','b','c']
           axis2 = ['x','y','z']
        }
        stage('Example') {
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
