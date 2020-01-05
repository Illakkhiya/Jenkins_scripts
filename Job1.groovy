node {
    stage('Test') {
	echo 'Hello World'
	git branch: 'master', url: 'https://github.com/Illakkhiya/Java_maven'
	sh "mvn clean packge -q -DskipTests=true"
	sh "mvn test"
    }
}
