import java.util.*;

public class CoffeeKiosk{
  public ArrayList<Items> menu = new ArrayList<Items>();
  public ArrayList<Orders> orders = new ArrayList<Orders>();

  public CoffeeKiosk(){

  }

  public void addMenuItem(Items item){
    this.menu.add(item);
  }

  public void displayMenu(){
    for(Items menuItems : this.menu){
      System.out.println(this.menu.indexOf(menuItems) + " " + menuItems.name + " -- $" + menuItems.price);
    }
  }

  public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
      System.out.println("-- Please enter customer name for new order:");
      String name = System.console().readLine();
  
    // Your code:
      // Create a new order with the given input string
      // Show the user the menu, so they can choose items to add.
      Orders order = new Orders();
      order.setName(name);
      this.displayMenu();
      
    // Prompts the user to enter an item number
      System.out.println("-- Please enter menu items index or q to quit: (e.g. 1,2,3,...)");
      String itemNumber = System.console().readLine();
      
      ArrayList<Items> yourOrder = new ArrayList<Items>();
      // Write a while loop to collect all user's order items
      while(!itemNumber.equals("q")) {
          String[] itemList = itemNumber.split(",");
          for(String item : itemList){
            int itemIndex = Integer.parseInt(item.trim());
            yourOrder.add(this.menu.get(itemIndex));
          }

          break;
          // Get the item object from the menu, and add the item to the order
          // Ask them to enter a new item index or q again, and take their input
      }

      System.out.println("Thank you " + name + ". Here is your order details: " );
      double total = 0.0;
      for(Items ordered : yourOrder){
        System.out.println(ordered.name + " -- $" + ordered.price);
        total += ordered.price;
      }
      System.out.println("Your total today is: $" + total);
      System.out.println("Have a great day!");

      // After you have collected their order, print the order details 
    // as the example below. You may use the order's display method.
      
  }

}