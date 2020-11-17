pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("Hello World") {
            steps {
                (fullname, message) = example6()
                script {
                    sh """
                        echo "fullname is ${fullname}"
                        echo "${message}"
                    """
                } 
            }
        }
    }
}
