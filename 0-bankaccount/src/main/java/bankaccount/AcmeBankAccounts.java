package bankaccount;

public class AcmeBankAccounts { 

    int balance = 0;  
    String holder;  
    int accountNumber;  
    int idAccounts = 1; //First number account  to use 
    int BankBalance = 0; // Total bank balance 
    AcmeBankAccounts (String holder, int initialBalance) { 
    // Create a new bank account for a client holder with an initial balance >= 0 
    // it will assign to the bank account an idAccount 
    // To be coded by the student 
    } 
    
    void printBankData() { 
    // Print the total Balance of the bank and the current accounts. 
    // To be coded by the student 
    } 
    
    void  withdrawal (int amount) { 
    // For the current account, withdrawal the indicated amount 
    // Decrement also the Bank balance 
    // To be coded by the student 
    
    } 
    
    void deposit(int amount) { 
    // To be coded by the student 
    } 
    
    void transfer (AcmeBankAccounts destinationAccount, int amount) { 
    //Transfert the amount to the destination Account 
    // To be coded by the student 
    } 
    
    void printAccountData() { 
    // print the account number, holder and  account balance 
    // To be coded by the student 
    } 
    
    public static void main(String[] args) { 
    AcmeBankAccounts cJuan = new AcmeBankAccounts ("Juan", 2000); 
    AcmeBankAccounts cPepe = new AcmeBankAccounts ("Pepe", 3000); 
    cJuan.printAccountData(); 
    cPepe.printAccountData(); 
    cJuan.transfer(cPepe, 1000); 
    cJuan.printAccountData(); 
    cPepe.printAccountData(); 
    //AcmeBankAccounts.printBankData();  
    } 
} 