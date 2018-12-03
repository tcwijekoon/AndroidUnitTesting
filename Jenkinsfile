pipeline {
  agent {
    label {
      label 'android-unittest-jenkins'
    }
  }
  stages {
	stage("build") {
	    steps {
	        container('gradle') {
	         	sh './gradlew assembleProd'
	        }
	     }
	}
	stage("Unit Test") {
        steps {
            container('gradle') {
                sh './gradlew testProdDebugUnitTest'
            }
         }
    }
  }
}