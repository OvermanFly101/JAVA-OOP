class Items{
  public String name;
  public double price;

  public void createItem(String name, double price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public void displayStatus(){
    String name = this.name;
    int nameLength = name.length();
    if(nameLength > 1){
      System.out.println(name + " has successfully been added as an item!");
    } else{
      System.out.println("Item is not correctly named or was not added.");
    }
  }
}