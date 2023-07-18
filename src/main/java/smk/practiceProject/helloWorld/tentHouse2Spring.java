package smk.practiceProject.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

public class tentHouse2Spring {
   public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(tentHouseConfig.class)) {
         System.out.println(context.getBean("name")); //we are retrieving bean s using this method
         System.out.println(context.getBean("age"));
         System.out.println(context.getBean("Person"));
         System.out.println(context.getBean("Address"));
         System.out.println(context.getBean("person1"));
         System.out.println(context.getBean("person2"));
         System.out.println(context.getBean("person3"));
         System.out.println(context.getBean("address1"));
         System.out.println(context.getBean("address2"));
         System.out.println(context.getBean(Address.class));
         System.out.println(context.getBean(Person.class));
         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
         System.out.println(context.getBean("person4"));
         System.out.println(context.getBean("address3"));
         System.out.println(context.getBean("person5"));
      }
   }
}
