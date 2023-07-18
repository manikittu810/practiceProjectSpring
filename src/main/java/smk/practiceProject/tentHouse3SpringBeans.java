package smk.practiceProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import smk.practiceProject.functions.Orders;
import smk.practiceProject.functions.SmkConsole;

public class tentHouse3SpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(srnthConfig.class)) {
            context.getBean(SmkConsole.class).Garitelu();
            context.getBean(Orders.class).run();
        }
    }
}
