#!groovy

pipeline {
	agent any
	
	environment {
        IMAGE_NAME = "Jenkins-Demo"
    	}
	
	stages {
	
		stage('Maven Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		
		stage('Docker Clean'){
			steps {
				sh 'docker stop ${IMAGE_NAME}'
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
