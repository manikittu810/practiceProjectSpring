package smk.practiceProject.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String lane, String city) {};

@Configuration
public class tentHouseConfig {
    @Bean
    public String name(){
        return "Deliver to Srivardhana Sharma today";
    }
    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public String Address(){
        return "He lives near Shivalayam";
    }
    @Bean
    public String Person(){
        return "Take the Advance from him";
    }
    @Bean
    public Person person1(){
        return new Person("Mani",23,new Address("Peddhambhatla gaddhe ","Dharmapuri"));
    }
    @Bean
    public Person person2(){
        return new Person("Sharma",23,new Address("bojjaVaari gaddhe ","Dharmapuri"));
    }
    @Bean
    @Primary
    public Person person3(String name,int age,Address address1){
        return new Person(name,age,address1);
    }
    @Bean
    public Person person4(String name, int age, Address address3){
        return new Person(name,age, address3);
    }
    @Bean
    public Person person5(String name, int age, @Qualifier("address3Qualifier") Address address3){
        return new Person(name,age, address3);
    }
    @Bean(name="address1")
    @Primary
    public Address address1(){
        return new Address("bojjawada","Dharmapuri");
    }
    @Bean(name="address2")
    public Address address2(){
        return new Address("Narasimha wada","Dharmapuri1");
    }
    @Bean(name="address3")
    @Qualifier("address3Qualifier")
    public Address address(){
        return new Address("kashetti wada", "dharmapuri");
    }
}
