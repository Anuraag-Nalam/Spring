package com.anuraag.helloWorld1.sub_learn_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Anuraag";
    }

    @Bean(name = "configureAge")
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Karthik", 90, address());
    }

    @Bean
    @Primary
    @Qualifier("PersonQualifier")
    public Person person2() {
        //using existing beans by calling methods
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address3) {
        //using parameters for managing the beans
        return new Person(name, age, address3);
    }
    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("ChecKAddress3") Address address2) {
        //using parameters for managing the beans
        //concept to be remembered-here when we use qualifier, the bean name after that does not matter unlilke other methods
        //no bean named address here, cant configure the third parameter as address
//        return new Person(name, age, address);
        return new Person(name,age,address2);
    }

    @Bean(name="address2")
    @Primary
    public Address address() {
        return new Address("abc", "gef");
    }
    @Bean(name = "address3")
    @Qualifier("ChecKAddress3")
    public Address address3() {
        return new Address("add3", "adddd3");
    }
    @Bean
    @Qualifier("checkAddress4")
    public Address address4() {
        return new Address("add34", "adddd34");
    }
}
