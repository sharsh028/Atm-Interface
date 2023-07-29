## ATM Interface in Java

This is a simple ATM (Automated Teller Machine) interface implemented in Java. The program provides basic functionalities that allow users to perform transactions such as viewing transaction history, making withdrawals, deposits, transfers, and quitting the application.


## Functionalities
1. Transactions History

Users can view their transaction history, which displays the details of their past transactions, including date, type of transaction (withdrawal, deposit, or transfer), and amount.

2. Withdraw
Users can make withdrawals from their account by specifying the amount they want to withdraw. The program ensures that the withdrawal amount does not exceed the available account balance.

3. Deposit
Users can deposit money into their account by specifying the amount they want to deposit. The deposited amount will be added to their account balance.

4. Transfer
Users can transfer funds from their account to another account within the ATM system. They need to provide the recipient's account number and the amount to be transferred. The program verifies that the account number is valid and that the transfer amount is not greater than the available balance.

5. Quit
Users can exit the ATM interface by choosing the "Quit" option. The program will gracefully terminate, and the user's data will be saved for future access.
## How to Use
1. Clone the repository to your local machine:
git clone https://github.com/sharsh028/atm-interface.git
cd atm

2. Compile the Java code:
javac ATM.java

3. Run the ATM application:
java ATM

The program will display a menu with the available functionalities. Follow the on-screen instructions to navigate and use the ATM interface.


## Dependencies
This project has no external dependencies. It is implemented using standard Java libraries.
## Notes
1. This ATM interface is intended for educational purposes and is not suitable for use in production environments. It lacks advanced security features and may not handle complex scenarios that real-world ATMs are designed to handle.

2. The user account data is stored in memory during program execution. As soon as the program terminates, the data will be lost. For a more persistent storage solution, consider integrating a database.

3. Feel free to customize and enhance the ATM interface to suit your specific needs and learning goals.
## License
This project is licensed under the MIT License.
## Contribution
Contributions to the project are welcome. If you find any bugs or would like to add new features, please open an issue or submit a pull request.
## Author
This ATM interface was created with ❤️ by Harsh Kumar Sharma.