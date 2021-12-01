import java.util.*;

public class BankAccount {
  private String name;
  private double checking;
  private double savings;
  private static int numberOfAccounts = 0;
  public static double moneyInBank = 0;
  
  public BankAccount(){
    this.name = "Guest";
    this.checking = 0.00;
    this.savings = 0.00;
  }

  public BankAccount(String name, double checking, double savings){
    this.name = name;
    this.checking = checking;
    this.savings = savings;
    numberOfAccounts++;
    //This will send to the method totalAccountMoney and give a total to the static moneyInAccount >>>
    double accSum = checking + savings;
    this.totalAccountMoney(accSum);
  }

  public String getName(){
    return this.name;
  }

  public double getChecking(){
    return this.checking;
  }

  public double addToChecking(double amount){
    this.checking += amount;
    return this.checking;
  }

  public double withdrawFromChecking(double withdraw){
    double withdrawn = withdraw;
    if(withdrawn > this.checking){
      System.out.println("Sorry, you have insufficient funds.");
    }else{
      this.checking -= withdrawn;
      System.out.println("Successfully withdrawed $" + withdrawn + " from checking account. You have $" + this.checking + " left in your account." );
    }
    return this.checking;
  }

  public double getSavings(){
    return this.savings;
  }

  public double addToSavings(double amount){
    this.savings += amount;
    return this.savings;
  }

  public double withdrawFromSavings(double withdraw){
    double withdrawn = withdraw;
    if(withdrawn > this.savings){
      System.out.println("Sorry, you have insufficient funds.");
    }else{
      this.savings -= withdrawn;
      System.out.println("Successfully withdrawed $" + withdrawn + " from savings account. You have $" + this.savings + " left in your account." );
    }
    return this.savings;
  }

  public double totalAmount(){
    double total = this.checking + this.savings;
    return total;
  }



  public double totalAccountMoney(double accSum){
    ArrayList<Double> accountTotals = new ArrayList<Double>();
    accountTotals.add(accSum);
    for(double money : accountTotals){
      moneyInBank = moneyInBank + money;
    }
    return moneyInBank;
  }


}