pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("Hello World") {
            steps {
                (fullname, message) = example6 "Obama" "Barrack"
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
