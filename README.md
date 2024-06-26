# Bookr: GraphQL Event Ticketing Service

**Bookr** is a comprehensive event ticketing service that leverages GraphQL, Spring Boot, and Netflix DGS for a seamless API experience. It integrates a React front-end and uses MyBatis-Plus for ORM with PostgreSQL as the database. This service supports various functionalities including user authentication, event management, and booking operations.
![Bookr Structure Model](bookr/photo/bookr%20structure%20model.png)
## Features

**API Endpoints**:
1. **User Management**: 
    - [x] User Signup
    - [x] User Login
    - [x] User Authorization

2. **Event Management**:
    - [x] Event Listing
    - [x] Event Searching

3. **Booking Operations**:
    - [x] Booking
    - [x] Cancellation

4. **Event Pricing**:
   - [ ] Edit Prices
   - [ ] Send offer

5. **Ticket Handling**:
   - [ ] Ticket Delivery

**Front-End Interface**:
- [ ] Develop a React front-end interface

**Mobile App Wrapper**:
- [ ] Create a mobile app wrapper for enhanced usability
    

## Technologies Used

- **Backend**: Spring Boot, GraphQL with Netflix DGS
- **Frontend**: React
- **Database**: PostgreSQL
- **ORM**: MyBatis-Plus
- **Hosting**: docker

## Installation

To set up the project locally, follow these steps:
- git clone the project
- download the required dependencies in pom.xml: mvn clean compile 
- host database on docker: docker-compose up -d
- docker status check: docker ps
- create your db on http://localhost:5050 per src/main/resources/application.yml
- create the db per sql/bookr.sql
- test the graphiql query on http://localhost:8080/graphiql per sql/graphiql
