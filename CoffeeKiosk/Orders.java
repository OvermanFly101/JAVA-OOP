import java.util.ArrayList;

class Orders{
  public String name;
  public double total;
  public boolean ready;
  public ArrayList<Items> items = new ArrayList<>();

  public void setName(String name){
    this.name = name;
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

  public void displayStatus(){
    for(Items item : this.items){
      System.out.println("Your shopping cart: " + item.name);
    }
    
    if(this.ready == true){
      System.out.println("Your order is ready, " + name);
      System.out.println("Your total is $" + this.total);
    } else{
      System.out.println("Sorry, your order is not ready yet. Please come back later.");
    }
  }
}