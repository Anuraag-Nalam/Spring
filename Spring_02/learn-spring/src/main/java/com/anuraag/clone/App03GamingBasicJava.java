package com.anuraag.clone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class App03GamingBasicJava {

    //managed by component annotation
//    @Bean
//    public GamingConsole game() {
//        var game = new PacManGame();
//        return game;
//    }

    //Beans are created automatically based on the arguments that the constructor recieves
    //new games are automatically created as they will be in the same package

//    @Bean(name = "gameRunner")
//    public GameRunner gameRunner(GamingConsole game) {
//        System.out.println("parameter "+game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(App03GamingBasicJava.class);
       Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
