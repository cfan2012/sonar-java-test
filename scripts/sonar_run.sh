#!/bin/bash
ant
/sonar-scanner/bin/sonar-scanner -Dsonar.projectKey=java -Dsonar.sources=java -Dsonar.java.binaries=java/build/classes