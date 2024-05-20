# Simple Java App for Testing Sonarqube 

## How to Run
```
$ mvn verify -DSONAR_ORG=xxxx -DSONAR_TOKEN=xxxx \ 
    org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \ 
    -Dsonar.projectKey=xxx 
```