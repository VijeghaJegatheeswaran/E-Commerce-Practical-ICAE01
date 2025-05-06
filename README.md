# E-Commerce-Practical-ICAE01
Smart Canteen Management System

Project Overview
This Spring Boot application implements a Smart Canteen Management System for University Vavuniya. The system manages multiple canteens across the campus, food items, daily menus, employees, students, and food orders.

Features
- Multiple canteen locations management
- Food item catalog with name, price, and weight
- Daily menu management for each canteen
- Employee management with canteen assignments
- Student profiles and academic information
- Food ordering system with detailed order lines
- Date-based tracking of all orders

Entity Relationship Model
The system consists of the following entities and their relationships:

1. Person(Abstract Base Class)
   - Common attributes: ID, name, age, gender
   - Extended by Employee and Student

2. Employee
   - Extends Person
   - Additional attribute: job position
   - Can be associated with multiple canteens

3. Student
   - Extends Person
   - Additional attribute: academic degree
   - Can place multiple food orders

4. Canteen
   - Attributes: ID, name, location
   - Has daily menus
   - Associated with multiple employees

5. Food
   - Attributes: ID, name, price, weight
   - Can appear in multiple daily menus

6. DailyMenu
   - Links food items to canteens on specific dates

7. FoodOrder
   - Placed by students
   - Contains order date
   - Consists of multiple order lines

8. OrderLine
   - Part of a food order
   - References specific food item and quantity
   - Connected to the daily menu
