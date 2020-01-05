node {
    stage('Test') {
	echo 'Hello World'
	build job: 'Job2', quitePeriod: 300
    }
}
