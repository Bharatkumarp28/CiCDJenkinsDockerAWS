FROM amazoncorretto:8
Expose 8095
Add target/JekinsDocker-0.0.1-SNAPSHOT.war JekinsDocker-0.0.1-SNAPSHOT.war
ENTRYPOINT  ["java","-jar","/JekinsDocker-0.0.1-SNAPSHOT.war"]
