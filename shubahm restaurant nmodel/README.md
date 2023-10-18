# Anish's Restaurant Management System
* This Spring Boot application manages a list of restaurants. It allows performing various operations on restaurants.

## Getting Started
### Prerequisites
* Java 8 or higher.
* Maven.

## Installation
* Clone the repository.
* Open the project in your preferred IDE.

## Running the Application
* Run AnishRestaurantModelApplication.java to start the Spring Boot application.
  #### java code
 * Copy code From Here......

`package com.Anish.Anish.Restaurant.Model;`

`import org.springframework.boot.SpringApplication;`
`import org.springframework.boot.autoconfigure.SpringBootApplication;`

`@SpringBootApplication`
`public class AnishRestaurantModelApplication {`

    public static void main(String[] args) {
        SpringApplication.run(AnishRestaurantModelApplication.class, args);
        System.out.println("Anish is Creating a Project in SpringBoot");
    }}


# Operations
## Get Restaurant by ID
#### Endpoint: `GET /restaurants/{id}`
#### Description: `Retrieves a restaurant by its ID.`
#### Parameters:
* id (Long): The ID of the restaurant to retrieve.


#### Response:
`200 OK` with the restaurant details if found.
`404 Not Found` if no restaurant with the given ID exists.
## Get All Restaurants

#### Endpoint: `GET /restaurants`
#### Description: `Retrieves a list of all restaurants.`
#### Response:
`200 OK` with the list of restaurants.

## Add Restaurant
#### Endpoint: `POST /restaurants`
#### Description: `Adds a new restaurant to the list.`
#### Request Body:
* JSON representing the restaurant details.


## Update Restaurant Specialty
#### Endpoint: `PUT /restaurants/{id}`
#### Description: `Updates the specialty of a restaurant.`
#### Parameters:
`id (Long):` The ID of the restaurant to update.
#### Request Parameter:
* `newSpecialty (String):` The new specialty for the restaurant.
#### Response:
* `200 OK` with the updated restaurant details if found.
* `404 Not` Found if no restaurant with the given ID exists.


# Delete Restaurant
#### Endpoint: `DELETE /restaurants/{id}`
#### Description: `Deletes a restaurant from the list.`
#### Parameters:
* `id (Long):` The ID of the restaurant to delete.
#### Response:
* `204 No` Content if the restaurant is successfully deleted.
* `404 Not Found` if no restaurant with the given ID exists.


* [Github Link](https://github.com/Anish1430/Anish-Restaurant-Model)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#io.validation)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

