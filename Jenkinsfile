pipeline {
  agent {
    none {
      label 'android-unittest-jenkins'
    }
  }
  stages {
	stage("Unit Test") {
	    steps {
	        container('gradle') {
	         	sh './gradlew assembleProd'
	         	sh './gradlew testProdDebugUnitTest'
	        }
	     }
	} 	
  }
}