package Challenge7.BankDetails;

public class Customer {
       public static void main(String[] args) {
              BankAccount bankaccount = new BankAccount(2345667,"Chirag Soni");
              bankaccount.depositMoney(100);
              System.out.println(bankaccount.withdrawMoney(20));
              System.out.println(bankaccount.currentBalance());
       }
       
}
