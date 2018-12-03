pipeline {
  agent {
    none {
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
  }
}