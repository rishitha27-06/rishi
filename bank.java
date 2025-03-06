class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            balance = 0.0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check the balance of the account
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a new bank account with an initial balance of $1000
        BankAccount myAccount = new BankAccount(1000.0);

        // Check the current balance
        myAccount.checkBalance();

        // Deposit some money
        myAccount.deposit(500.0);

        // Withdraw some money
        myAccount.withdraw(200.0);

   
