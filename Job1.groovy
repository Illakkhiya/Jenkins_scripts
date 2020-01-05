node {
    stage('Test') {
	echo 'Hello World'
	build job: 'Job2'
    }
}
