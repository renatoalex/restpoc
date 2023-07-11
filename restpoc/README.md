# Rest Poc

*Rest Poc* is a Rest Api Demo for managing users.

## Prerequisites
Java Development Kit (JDK) version 17 or above installed on your machine

## Instalation

From root folder ``restpoc`` of the project execute the following commands:

# run the spring boot app
'com.ramp.poc.restpoc.RestpocApplication'

## API

The Api is available at endpoint api/users

```
GET '/' - Retrieve all users
GET '/:id' - Retrieve user by id
GET '/username/:name - Retrieve user by username
POST '/' (body) - Create a user 
PUT '/:id' (body) - Update a user
DELETE '/:id' - Remove a user
```