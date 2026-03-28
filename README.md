# Recipe Catalog Application

## Overview
This project is a web application for managing recipes.  
It allows users to create, view, edit, and delete recipes, as well as manage recipe categories.

The application is built using Spring Boot with Thymeleaf for the frontend and H2 database for data storage.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

## Features Implemented

### Recipe Management
- Create new recipes
- View all recipes on the main page
- View detailed information about a recipe
- Edit existing recipes
- Delete recipes

Each recipe includes:
- Title
- Description
- Instructions
- Cooking time
- Servings
- Category

### Category Management
- View all categories
- Add new categories
- Delete categories

### User Interface
- Responsive and modern design
- Navigation between pages (Home, Categories, Add Recipe)
- Styled recipe cards
- Form for adding and editing recipes
- Detailed recipe page

### Database
- H2 in-memory database
- Data is stored using JPA entities
- Relationships between recipes and categories

## Application Structure

The project follows a layered architecture:

- `controller` – handles HTTP requests
- `service` – contains business logic
- `repository` – interacts with the database
- `entity` – defines database models
- `templates` – Thymeleaf HTML pages
- `static` – CSS styles

## Main Pages

- `/` – displays all recipes
- `/recipes/new` – form to create a new recipe
- `/recipes/{id}` – view recipe details
- `/recipes/edit/{id}` – edit recipe
- `/categories` – manage categories

## How to Run the Application

1. Open the project in VS Code
2. Run the main class: RecipeCatalogApplication.java
3. Open a browser and go to: http://localhost:8080/
