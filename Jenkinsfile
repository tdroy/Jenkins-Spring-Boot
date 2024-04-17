#!groovy

pipeline {
	agent any
	
	environment {
        IMAGE_NAME = "jenkins-demo"
    }
	
	stages {
	
		stage('Maven Build'){
			steps{
				sh 'mvn clean package -Dmaven.test.skip=true'
			}
		}
		
		stage('Docker Clean'){
			steps {
				sh 'docker stop ${IMAGE_NAME} || true'
				sh 'docker rm ${IMAGE_NAME} || true'
			}
		}
		
		stage('Docker Image'){
			steps {
				sh 'docker build -t ${IMAGE_NAME}:${BUILD_NUMBER} .'
			}
		}
		
		stage('Docker Run'){
			steps {
				sh 'docker run -d -p 9090:9090 --name ${IMAGE_NAME} ${IMAGE_NAME}:${BUILD_NUMBER}'
			}
		}
		
	}
}
