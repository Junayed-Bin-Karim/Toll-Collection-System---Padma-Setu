# Padma Bridge Toll System

This is a simple Java Swing application for managing toll entries at the Padma Bridge. It provides basic functionalities for registration, login, entering toll data, viewing toll rates, and generating a daily report.

## Features

* **Registration:** Allows new users (toll officers) to register with a username and password.
* **Login:** Enables registered users to log in to the system.
* **Toll Rate:** Displays the toll rates for different vehicle types.
* **Toll Entry:** Allows toll officers to record toll information, including:
    * Car Serial Number
    * Car Name
    * Toll Point
    * Toll Amount
    * Collector's Name
* **Day Report:** Generates a simple report displaying all the toll entries made during the day.

## Technologies Used

* Java
* Swing (for the graphical user interface)
* A simple `HashMap` for storing user registration information.
* `ArrayList`s for storing toll entry data.

## How to Run

1.  **Prerequisites:** Make sure you have Java Development Kit (JDK) installed on your system.
2.  **Download:** Download the Java source files (`Main.java`, `Menu.java`, `Registration.java`, `SubmitData.java`, `TollMenu.java`, `TollRate.java`, `ViewData.java`).
3.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the files, and compile the Java files using the following command:
    ```bash
    javac *.java
    ```
4.  **Run:** After successful compilation, run the main application using:
    ```bash
    java Main
    ```
    This will launch the main menu of the Padma Bridge Toll System.

## Application Structure

The application consists of the following classes:

* `Main`: The entry point of the application, creating an instance of the `Menu` class.
* `Menu`: The main menu of the application, providing options for Registration and Login.
* `Registration`: Handles user registration and login functionalities. It uses a `HashMap` to store registered usernames and passwords.
* `TollMenu`: The main menu for logged-in toll officers, offering options for viewing toll rates, entering toll data, and viewing the day report.
* `SubmitData`: Allows toll officers to enter new toll information. This data is stored in `ArrayList`s.
* `ViewData`: Displays the daily toll report based on the data entered through the `SubmitData` class.
* `TollRate`: Displays a table showing the toll rates for different vehicle types.

## Limitations

* **Data Persistence:** The application does not currently store data permanently. All entered data is lost when the application closes.
* **Security:** User registration and login are very basic and do not implement any robust security measures.
* **Reporting:** The day report is a simple display of the entered data without any advanced filtering or analysis.
* **Error Handling:** Basic error handling is implemented (e.g., checking for empty fields), but more comprehensive error management could be added.
* **Scalability:** The use of in-memory data structures like `HashMap` and `ArrayList` makes the application not suitable for handling a large volume of data or concurrent users.

## Potential Future Enhancements

* Implement data persistence using files (e.g., CSV, text files) or a database.
* Enhance user authentication and security.
* Add more advanced reporting features, such as filtering by date, toll point, or vehicle type.
* Implement user roles and permissions.
* Improve the user interface and overall user experience.
* Consider using a more robust data structure or database for handling larger datasets.


---

## Author

**Md. Junayed Bin Karim**  
 CSE Student at Daffodil International University  
GitHub](https://github.com/Junayed-Bin-Karim)  
 [LinkedIn](https://www.linkedin.com/in/junayed-bin-karim-47b755270/)  
 karim22205101667@diu.edu.bd  



---
