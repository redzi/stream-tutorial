node ('master') {
    checkout scm
    stage('Build') {
        withMaven(maven: 'M3') {
            if (isUnix()) {
                sh 'mvn -Dmaven.test.failure.ignore clean package'
            }
            else {
                bat 'mvn -Dmaven.test.failure.ignore clean package'
            }
        }
    }
    stage('Install') {
        if ( params.install == true ) {
            withMaven(maven: 'M3') {
                if (isUnix()) {
                     sh 'mvn -Dmaven.test.failure.ignore clean install'
                }
                else {
                     bat 'mvn -Dmaven.test.failure.ignore clean install'
                }
            }
        }
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archive 'target/*.jar'
    }
}
