package com.anuraag.clone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game=new PacManGame();
        return game;
    }
    @Bean(name="gameRunner")
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner=new GameRunner(game);
        return gameRunner;
    }
}
