# Simple Java App for Testing Sonarqube 

## How to Run
```
$ mvn verify -DSONAR_ORG=xxxx -DSONAR_TOKEN=xxxx \ 
    org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \ 
    -Dsonar.projectKey=xxx 
```

## curl Commands

Create a new record
```
$ curl -kv http://localhost:8080/employee/ -X POST \ 
        -d '{"employeeName":"lele"}' \ 
        -H "Accept: application/json" \ 
        -H "Content-type: application/json"
```

Get one record
```
$ curl -kv http://localhost:8080/employee/2
```