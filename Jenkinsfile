#!groovy

pipeline {
	agent none
	
	stages {
	
		stage('Maven Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		
		stage('Docker Image'){
			steps {
				sh 'docker build -t demo:${BUILD_NUMBER}'
			}
		}
		
		stage('Docker Run'){
			steps {
				sh 'docker run -d -p 9090:9090 -name Demo demo:${BUILD_NUMBER}'
			}
		}
		
	}
}
