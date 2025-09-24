pipeline {
    agent any

    tools {
        jdk 'jdk_home'           // JDK name in Jenkins
        maven 'maven-home'       // Maven name in Jenkins
    }

    stages {
        // ---------------- Checkout ----------------
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/omkar3720/SpringBootApp.git'
            }
        }

        // ---------------- Dev Environment ----------------
        stage('Dev Environment') {
            stages {
                stage('Build (Dev)') {
                    steps {
                        echo "Building project for Dev..."
                        bat 'mvn clean install -DskipTests'
                    }
                }
                stage('Deploy (Dev)') {
                     steps {
        echo "Deploying to Dev Tomcat..."
        bat 'copy "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MyPipeline\\target\\springbootcrudapp.app1-0.0.1-SNAPSHOT.war" "D:\\Tomcat 1\\apache-tomcat-10.1.46\\webapps\\"'
    }
                }
            }
        }

        // ---------------- Test Environment ----------------
        stage('Test Environment') {
            stages {
                stage('Build (Test)') {
                    steps {
                        echo "Building project for Test..."
                        bat 'mvn clean install -DskipTests'
                    }
                }
                stage('Deploy (Test)') {
                    steps {
                        echo "Deploying to Test Tomcat..."
                         bat 'copy "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MyPipeline\\target\\springbootcrudapp.app1-0.0.1-SNAPSHOT.war" "D:\\Tomcat 2\\apache-tomcat-10.1.42\\webapps\\"'
                    }
                }
            }
        }

        // ---------------- Approval Before Prod ----------------
        stage('Approval Before Prod') {
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    input message: "Do you want to deploy to Production?"
                }
            }
        }

        // ---------------- Prod Environment ----------------
        stage('Prod Environment') {
            stages {
                stage('Build (Prod)') {
                    steps {
                        echo "Building project for Prod..."
                        bat 'mvn clean install -DskipTests'
                    }
                }
                stage('Deploy (Prod)') {
                    steps {
                        echo "Deploying to Prod Tomcat..."
                        bat 'copy "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MyPipeline\\target\\springbootcrudapp.app1-0.0.1-SNAPSHOT.war" "D:\\Tomcat 3\\apache-tomcat-10.1.39\\webapps\\"'
                    }
                }
            }
        }
    }
}
