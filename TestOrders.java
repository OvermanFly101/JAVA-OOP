import java.util.ArrayList;
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
    
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.name = "Jimmy";
        order1.total = 12.99;
        order1.ready = true;
        ArrayList<Items> shoppingBag1 = new ArrayList<>();
        shoppingBag1.add(item3);
        order1.setItems(shoppingBag1);

        Orders order2 = new Orders();
        order2.name = "Cindhuri";
        order2.total = 7.00;
        order2.ready = true;
        ArrayList<Items> shoppingBag2 = new ArrayList<>();
        shoppingBag2.add(item2);
        shoppingBag2.add(item1);
        order2.setItems(shoppingBag2);

        Orders order3 = new Orders();
        order3.name = "Noah";
        order3.total = 16.99;
        order3.ready = false;
        ArrayList<Items> shoppingBag3 = new ArrayList<>();
        shoppingBag3.add(item1);
        shoppingBag3.add(item2);
        order3.setItems(shoppingBag3);

        Orders order4 = new Orders();
        order4.name = "Sam";
        order4.total = 34.00;
        order4.ready = true;
        ArrayList<Items> shoppingBag4 = new ArrayList<>();
        shoppingBag4.add(item3);
        shoppingBag4.add(item3);
        shoppingBag4.add(item2);
        shoppingBag4.add(item2);
        shoppingBag4.add(item2);
        order4.setItems(shoppingBag4);

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        order2.displayStatus();
    }
}