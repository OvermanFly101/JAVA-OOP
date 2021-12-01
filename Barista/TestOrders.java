import java.util.*;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 4.00;

        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 3.00;

        Items item3 = new Items();
        item3.name = "Fried Chicken";
        item3.price = 12.99;

        Items item4 = new Items();
        item4.name = "drip coffee";
        item4.price = 4.25;

        Items theItem1 = new Items();
        theItem1.createItem("cold brew", 4.50);
    
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.setReady();
        ArrayList<Items> shoppingBag1 = new ArrayList<>();
        shoppingBag1.add(item3);
        shoppingBag1.add(item3);
        order1.setItems(shoppingBag1);

        Orders order2 = new Orders();
        order2.setName("Cindhuri");
        order2.setReady();
        ArrayList<Items> shoppingBag2 = new ArrayList<>();
        shoppingBag2.add(item2);
        shoppingBag2.add(item1);
        order2.setItems(shoppingBag2);
        order2.display();

        Orders order3 = new Orders();
        order3.setName("Noah");
        order3.addToItems(theItem1);
        order3.display();

        Orders order4 = new Orders();
        order4.setName("Sam");
        ArrayList<Items> shoppingBag4 = new ArrayList<>();
        shoppingBag4.add(item3);
        shoppingBag4.add(item3);
        shoppingBag4.add(item2);
        shoppingBag4.add(item2);
        shoppingBag4.add(item2);
        order4.setItems(shoppingBag4);
        System.out.println(order4.getOrderTotal());

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        

        //System.out.println("An item with the name of " + theItem.getName() + " and a price of $" + theItem.getPrice() + " has been added to Items class.");
    }
}