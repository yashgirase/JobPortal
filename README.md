# Job_Portal
Basic Job Portal is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow
* Controller : In controller class I have exposed Endpoints for each operation like postJob , getJobById , deleteJob etc.

* Service : In Service class I have written the logic for each of API method and return it.

* Repository : Basically repository is an interface which is extending CrudRepository of JPA. It is used to to do crud operations on DB.

* DataBase Design : I have used m2 as an detabase which is in memory data base only.

## Data Structure

I have used m2 as an detabase which is in memory data base only.

## Project Summary

I have created a job portal where jobs can be get posted and can accessed as well by usid Id and also by locations. I have given many features like get jobs list according to types , company names etc. I have used m2 as database to store my data of jobs.
