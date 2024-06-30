package com.anuraag.helloWorld1.sub_learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Launch a spring context
        //configure the things that we want spring to context
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(
                        HelloWorldConfiguration.class);
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("configureAge"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person3"));
//        System.out.println(context.getBean(Person.class));
//        Arrays.stream(context.
//                getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(context.getBean("person4Parameters"));
//        System.out.println(context.getBean("address3"));
//        System.out.println("checkin");
    }

//    record Address(String address1, String address2) {
//
//    }
//
//   record Person(String name, int age, Address address) {
//
//    }
}
