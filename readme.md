# 🚀 Project: Turbo Vehicle Rental System 🚗💨

Welcome to the Turbo Vehicle Rental System! This isn't your average vehicle rental system - it's a vehicle rental system that's been supercharged with Java Spring, React.js, Hibernate, Docker, and MySQL. We've deployed it on Digital Ocean in a Docker container because we're all about that high-speed, high-performance life. 🏎️💨

## 🛠 Pit Stop: The Tech Stack

- **Front-end**: React.JS, CSS, HTML, and JavaScript for that sleek, aerodynamic user experience.
- **Back-end**: Java, Spring Boot, Spring Data JPA, and Spring Security working behind the scenes. Hibernate handles ORM, with MySQL as the trusty sidekick.
- **Security**: JWT of Spring Security is our top-notch security system, handling both authentication and authorization.

## 🌐 Project Overview

Turbo Vehicle Rental System is like the Uber of vehicle rentals, but without the awkward small talk. We've designed it to handle the renting of various types of vehicles for a short period of time, generally ranging from a few hours to a few weeks.

## 📝 User Roles

We have three main roles in our system:

- **Admin**: They're the pit crew, adding and modifying vehicles and users. They can also reserve vehicles.
- **User**: All users can search the catalog, as well as reserve, pick-up, and return a vehicle.
- **System**: The system is like the race director, mainly responsible for sending notifications about overdue vehicles, canceled reservation, etc.

## 🏗️ Main Classes

Here are the main classes of our Vehicle Rental System:

- **CarRentalSystem**: The main part of the organization for which this software has been designed.
- **CarRentalLocation**: The vehicle rental system will have multiple locations, each location will have attributes like ‘Name’ to distinguish it from any other locations and ‘Address’ which defines the address of the rental location.
- **Vehicle**: The basic building block of the system. Every vehicle will have a barcode, license plate number, passenger capacity, model, make, mileage, etc. Vehicles can be of multiple types, like car, truck, SUV, etc.
- **Account**: Mainly, we will have two types of accounts in the system, one will be a general member and the other will be a receptionist.
- **VehicleReservation**: This class will be responsible for managing reservations for a vehicle.
- **Notification**: Will take care of sending notifications to members.
- **VehicleLog**: To keep track of all the events related to a vehicle.
- **RentalInsurance**: Stores details about the various rental insurances that members can add to their reservation.
- **Equipment**: Stores details about the various types of equipment that members can add to their reservation.
- **Service**: Stores details about the various types of service that members can add to their reservation, such as additional drivers, roadside assistance, etc.
- **Bill**: Contains different bill-items for every charge for the reservation.

## 💻 Code

The code of the project is organized into a front-end and a back-end Directories. The front-end is built with React.js and is located in the `/Front-end` directory. The back-end is built with Java and Spring Boot and is located in the `/Back-end` directory.

## 🚀 Deployment

The application is containerized using Docker and deployed on Digital Ocean. You can check out the `Dockerfile` for the specifics of the container setup.

That's it! We hope you enjoy using our Vehicle Rental System as much as we enjoyed building it. Now, buckle up and enjoy the ride! 🚗💨
