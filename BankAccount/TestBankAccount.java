import java.util.*;

public class TestBankAccount{
  public static void main(String[] args){
    BankAccount JimsAcc = new BankAccount("Jim", 245.00, 1234.00);
    BankAccount PamsAcc = new BankAccount("Pam", 650.00, 3000.00);
    BankAccount DwightAcc = new BankAccount("Dwight", 4387.00, 70000.00);
    System.out.println(JimsAcc.getName());
    System.out.println(BankAccount.moneyInBank);

  }
}