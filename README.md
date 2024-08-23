Monacemebi App
Monacemebi is a data management application built with Java, React, and PostgreSQL that allows users to insert, edit, search, and delete human data such as name, family name, age, and gender. The app is designed to be user-friendly and ensures efficient data management through a well-integrated database.

Table of Contents
Features
Technologies Used
Installation
Usage
Live Demo
Contributing
License
Contact
Features
Data Management: Add, edit, search, and delete human data.
Responsive Design: The app is fully responsive, providing a seamless experience across different devices.
PostgreSQL Integration: Efficient data storage and retrieval using PostgreSQL.
User-Friendly Interface: Intuitive and easy-to-navigate user interface.
Technologies Used
Frontend: React, HTML, CSS
Backend: Java, Spring Boot
Database: PostgreSQL
Build Tools: Gradle
Installation
To set up the Monacemebi app locally, follow these steps:

Prerequisites
Java 17 installed
Node.js and npm installed
PostgreSQL installed and configured
Backend Setup
Clone the repository:

git clone https://github.com/DavidGogishvili/monacemebi-backend.git
cd monacemebi-backend
Configure the database settings in application.properties:

properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
Build and run the backend application:


./gradlew bootRun
Frontend Setup
Navigate to the frontend directory:


cd monacemebi-frontend
Install dependencies:


npm install
Start the development server:


npm start
Access the app at http://localhost:3000 in your browser.

Usage
Add Human Data: Enter details such as name, family name, age, and gender.
View Human Data: Browse through the table to see all the entries.
Search: Use the search feature to find specific records.
Edit: Click on the edit button next to any record to modify the data.
Delete: Remove unwanted records by clicking the delete button.
Live Demo
Monacemebi App Live Demo

Contributing
Contributions are welcome! Please follow these steps to contribute:

Fork the repository.
Create a new branch (git checkout -b feature/your-feature).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature/your-feature).
Open a pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any inquiries or feedback, feel free to contact me:

Email: davidd.gogishvili@gmail.com
LinkedIn: David Gogishvili
GitHub: DavidGogishvili
