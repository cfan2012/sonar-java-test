#!/bin/bash
ant

PROJECT_NAME=xbtest

/sonar-scanner/bin/sonar-scanner -Dsonar.projectKey=xbtest -Dsonar.sources=${PROJECT_NAME} -Dsonar.java.binaries=${PROJECT_NAME}/build/classes
