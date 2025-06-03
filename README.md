# Sifiso-Survey
Sifiso-Survey is a web-based survey application designed to gather and store data about individuals' lifestyle preferences. It allows users to participate in surveys and stores their responses in a structured database for future analysis.

IDE: NETBEANS 8 and GlASSFISH SERVER

🔧 Tools & Technologies Used Frontend:

HTML – For creating the structure of the survey pages.

CSS – For styling and layout customization of the user interface.

Backend:

Java (JEE – Java Enterprise Edition) – For implementing server-side logic, servlet handling, and integration with the database.

Apache Derby DB – A lightweight, embedded relational database used for storing survey responses using entities.

📌 Features User-friendly interface for filling out lifestyle surveys.

Backend logic using Java Servlets and JSP.

Storage of survey data into Derby database tables.

Validation to ensure all required fields are filled before submission.

The user may NOT enter a value for Age that is less than 5 and should not be more than 120.

Ensure that the user has actually selected a rating for each of the four rating questions. They cannot submit a survey without selecting a rating.

Where the user is expected to enter the date, use a date picker

MVC design pattern for separation of concerns (Model-View-Controller).
