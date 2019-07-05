# User Management Demo
Demo of User Management

# Run the application
* mvn package && java -jar target/usermanagement-0.0.1-SNAPSHOT.jar 
* Open http://localhost:8080

# Run with docker
* Build docker image locally: docker build -t user-demo .
* Run container: docker run -p 8000:8080 user-demo
* Open http://localhost:8000

# Run with docker-compose
* Run docker-compose up
* Open http://localhost:8000

#H2 Database console
Access H2: 
URL: http://localhost:8080/console



