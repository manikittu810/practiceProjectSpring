package smk.practiceProject;

import smk.practiceProject.functions.Items;
import smk.practiceProject.functions.Orders;
import smk.practiceProject.functions.functionHall;

public class tentHouse {
    public static void main(String[] args) {
//        var items= new Items();
//        var items =new functionHall();
        var items = new DeliveryDate();
        var orders=new Orders(items);
        orders.run();
    }
}
