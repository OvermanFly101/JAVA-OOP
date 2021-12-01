import java.util.*;

class Orders{
  private String name;
  public boolean ready;
  public ArrayList<Items> items = new ArrayList<>();

  public Orders(){
    this.name = "Guest";
    this.ready = false;
  }

  public Orders(String name){
    this.name = name;
    this.ready = false;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setReady(){
    this.ready = true;
  }

  public String getReady(){
    if(this.ready == true){
      return "Ready!";
    }else{
      return "Not ready!";
    }
  }

  public ArrayList<Items> getItems(){
    return this.items;
  }

  //setSkill replace the whole ArrayList of items
  public void setItems(ArrayList<Items> theItems){
      this.items = theItems;
  }

  //addToSkills DO NOT replace, it adds
  public void addToItems(Items item){
      this.items.add(item);
  }  

  public double getOrderTotal(){
    double total = 0.0;
    for(Items itemPrice : this.items){
      total = total + itemPrice.price;
    }
    return total;
  }

  public void displayStatus(){
    for(Items item : this.items){
      System.out.println("Your shopping cart: " + item.name);
    }
    
    if(this.ready == true){
      System.out.println("Your order is ready, " + name);
      System.out.println("Your total is $" + this.getOrderTotal());
    } else{
      System.out.println("Sorry, your order is not ready yet. Please come back later.");
    }
  }

  public void display(){
    System.out.println("Customer Name: " + this.name );
    for(Items item : this.items){
      System.out.println(item.name + " - " + item.price);
    }
    System.out.println("Total: " + this.getOrderTotal());
  }
}