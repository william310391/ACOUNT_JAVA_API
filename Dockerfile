# #Start with a base image containing Java runtime
# FROM openjdk:17-jdk-slim

# #Information around who maintains the image
# MAINTAINER eazybytes.com

# # Add the application's jar to the image
# COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# # execute the application
# ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]



#./mvnw clean package
#docker build . -t eazybytes
#docker run  --name account -d -p 8080:8080 zerow01/account:s4 
#docker rm account -f
#docker push zerow01/account

#docker compose up --build -d
#docker compose down   
#docker compose stop
#docker compose start