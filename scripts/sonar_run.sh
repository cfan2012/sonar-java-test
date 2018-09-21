#!/bin/bash
ant

PROJECT_NAME=java

/sonar-scanner/bin/sonar-scanner -Dsonar.projectKey=deskcheck -Dsonar.sources=${PROJECT_NAME} -Dsonar.java.binaries=${PROJECT_NAME}/build/classes