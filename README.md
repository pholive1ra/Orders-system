# Orders System

Order management system developed in Java with a focus on Object-Oriented Programming (OOP), applying fundamental concepts such as enumeration, composition, encapsulation, lists, constructors, business methods, and package organization.

This project simulates the basic flow of an order system, including customer management, products, and order status control.

---

## Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

---

## Concepts Applied

* Object-Oriented Programming (OOP)
* Enumeration (`enum`)
* Class Composition
* Encapsulation (`private`)
* Getters and Setters
* Constructors
* Method Overriding (`toString`)
* `StringBuilder`
* Collections (`List`, `ArrayList`)
* Loop Structure (`for each`)
* Wrapper Classes (`Integer`, `Double`)
* Package Organization

---

## Project Structure

```text
src
├── application
│   └── Main.java
│
├── entities
│   ├── Cliente.java
│   ├── Produto.java
│   └── Pedido.java
│
└── entities.enums
    └── StatusPedido.java
```

---

## Features

* Customer registration
* Product registration
* Order creation
* Add and remove products from the order
* Product subtotal calculation
* Total order value calculation
* Order status control using enum
* Complete order data display

---

## Output Example

```java
ORDER DETAILS:

Customer: Pedro
Age: 20
Email: pedrohenrqdev@gmail.com

Status: PROCESSING

Products:
Product: 1KG Beans
Price: $10.50
Quantity: 5
Subtotal: $52.50

TOTAL: $52.50
```

---

## Project Purpose

This project was developed to strengthen Java fundamentals and consolidate essential object-oriented programming concepts, serving as preparation for more advanced topics such as inheritance, polymorphism, interfaces, and data persistence.

---

## Next Steps

Planned future improvements:

* `OrderItem` implementation
* Inheritance and Polymorphism
* Exception Handling
* File Persistence
* Database Integration
* REST API with Spring Boot

---

## Author

Pedro Oliveira

Software developer in training, focused on Java, software architecture, and clean coding practices.
