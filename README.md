# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics

## Student Information
- Nama : Tsabita Aulia Rakhmah
- Student Id : 5026251129
- Class : E

## Project Description
This project is a simple Tic-Tac-Toe game built using Java Swing as the graphical user interface. The application allows users to log in using data stored in a database, play a Tic-Tac-Toe game against a computer, and automatically record game results such as wins, losses, draws, and total score. Additionally, users can view their personal statistics and see the Top 5 players with the highest scores. This project demonstrates the implementation of Object-Oriented Programming (OOP) concepts, GUI development, and database integration using JDBC.

## Features
- Login using database 
- Play Tic-Tac-Toe using Java Swing GUI
- Computer opponent with random move logic
- Record wins, losses, draws, and score automatically
- Display personal player statistics
- Display Top 5 scorers 
- Logout functionality

## Database
Database used: MySQL

## How to Run
1. Create a database
2. Import schema.sql
3. Open the Java project
4. Add JDBC driver
5. Configure database connection
6. Run Main.java to start the application

## Class Explanation
- Main: The Main class serves as the entry point of the application. It is responsible for starting the program by launching the LoginFrame, which is the first interface displayed to the user when the application runs.
- DatabaseManager: The DatabaseManager class is used to manage the connection between the Java application and the MySQL database using JDBC. It provides a method to establish a connection so that other classes can easily interact with the database.
- Player : The Player class acts as a model that represents a player in the application. It stores important information such as the player’s id, username, number of wins, losses, draws, and total score.
- PlayerService : The PlayerService class acts as a bridge between the application and the database for all player-related operations. It handles user login validation, updates player statistics after each game, and retrieves player data such as the Top 5 scorers and player details.
- GameLogic : The GameLogic class contains the core logic of the Tic-Tac-Toe game. It manages the game board, validates player moves, generates random moves for the computer, and checks for win, lose, or draw conditions.
- LogicFrame : The LoginFrame class is responsible for creating the login interface using Java Swing. It allows users to enter their username and password, and then validates the input through the PlayerService before granting access to the main menu.
- MainMenuFrame : The MainMenuFrame class displays the main menu after a successful login. It provides navigation options such as starting a new game, viewing player statistics, viewing the Top 5 players, and logging out.
- GameFrame : The GameFrame class handles the graphical interface of the Tic-Tac-Toe game using a 3x3 grid of buttons. It connects user interactions with the GameLogic and controls the game flow until a result is reached.
- StatisticsFrame : The StatisticsFrame class is used to display the current player’s statistics. It shows information such as the number of wins, losses, draws, and the total score.
- TopScoreFrame : The TopScorersFrame class is responsible for displaying the Top 5 players with the highest scores. The data is retrieved from the database and presented in a table format using JTable.

## Screenshots 
<img width="298" height="211" alt="Login-window" src="https://github.com/user-attachments/assets/33b961f9-652e-47c8-bb6a-79d918096a50" />
<img width="394" height="308" alt="MainMenu-window" src="https://github.com/user-attachments/assets/313749cb-4ca2-405c-bc7b-1e6c12bec73e" />
<img width="440" height="430" alt="Game-window" src="https://github.com/user-attachments/assets/b8fe4802-c1c1-4af8-a56c-ad9c700cc5f8" />
<img width="316" height="260" alt="Statistic-window" src="https://github.com/user-attachments/assets/ad708270-5110-4fc2-b192-cbbf036c77b6" />
<img width="403" height="309" alt="Top-scores-window" src="https://github.com/user-attachments/assets/d9adc04d-32a7-4565-87ab-4eabf40e93a2" />

## Video Link
Youtube : 
