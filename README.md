 BookShop
E-commerce book purchase and checkout testing
Installation:
To set up this project on your local machine, follow these steps:
1. Clone the repository
https://github.com/idabarucija/BookShop.git

 2. Navigate to the project directory
    cd BookShop

 3. Install dependencies
mvn clean install

Technologies Used:

Java

Selenium WebDriver

JUnit

Maven

IntelliJ IDEA

Project Structure

project-root/
│── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── BaseSetup.java           Base test setup
│   │   │   ├── PageBookCart.java        Page Object Model for book cart
│   │   │   ├── TestBookCart.java        Test cases for book purchase
│── target/
│   ├── test-classes/                    Compiled test classes
│── README.md                            Project documentation
│── pom.xml                              Maven dependencies and configuration
│── .gitignore                           Files to ignore in Git
