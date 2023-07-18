package smk.practiceProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import smk.practiceProject.functions.Orders;
import smk.practiceProject.functions.SmkConsole;

@Configuration
public class srnthConfig {
    @Bean
    public SmkConsole items(){
       var items =new DeliveryDate();
       return items;
    }

    @Bean
    public Orders Orders(SmkConsole items){
        var orders = new Orders(items);
        return orders;
    }

    //        var items= new Items();
//        var items =new functionHall();
//    var items = new DeliveryDate();
//    var orders=new Orders(items);
//        orders.run();
}
