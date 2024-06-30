package com.anuraag.clone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();

        //Not working, dont know why
//        context.getBean("gameRunner").run();


        context.getBean(GameRunner.class).run();
    }
}
