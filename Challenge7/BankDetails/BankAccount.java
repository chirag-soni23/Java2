package Challenge7.BankDetails;

public class BankAccount {
       @SuppressWarnings("unused")
       private int accountNumber;
       @SuppressWarnings("unused")
       private String accountHolder;
       private double balance;


       public BankAccount(int accountNumber, String accountHolder) {
              this.accountNumber = accountNumber;
              this.accountHolder = accountHolder;
       }

       public double currentBalance(){
              return balance;
       }

       public void depositMoney(double money){
              if(money <=0){
                     System.out.println("Invalid deposit");
              }
              else{
                     balance += money;
              }
       }

       public double  withdrawMoney(double money){
              if(money <= 0){
                     System.out.println("Invalid withdraws");
              }
              else if(balance >= money){
                     balance -= money;
              }
              else{
                     money = balance;
                     balance = 0;
              }
              return money;


       }




}
