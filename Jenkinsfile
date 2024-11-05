pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'gradle build'
                }
            }
        }
        stage('Helm Package') {
            steps {
                script {
                    sh 'gradle helmPackage'
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    sh 'gradle dockerBuild'
                }
            }
        }
        stage('Publish') {
            steps {
                script {
                    // Add your Docker registry login and push logic
                    sh 'docker push your-repo/my-controller:latest'
                }
            }
        }
    }
}
