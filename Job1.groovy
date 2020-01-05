node {
    stage('Test') {
	echo 'Hello World'
        steps {
		git branch: 'master', url: 'https://github.com/Illakkhiya/Java_maven'
		sh "mvn clean packge -q -DskipTests=true"
		sh "mvn test"
	}
	//build job: 'Job2', quietPeriod: 300, wait: false
    }
}
