node {
    stage('Test') {
	echo 'Hello World'
	copyArtifacts projectName: 'Job1' , selector: upstream()
	sh 'cat Hello.txt'
    }
}
