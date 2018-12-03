pipeline {
  agent {
    kubernetes {
      label 'android-unittest-jenkins'
    }
  }  
  stages {  ''
	stage("Unit Test") {
	    steps {
	        container('gradle') {
	         sh 'chmod -R o+xw ./'
	         	sh './gradlew assembleProd'
	         	sh './gradlew testProdDebugUnitTest'
	        }
	     }
	} 	
  }
}