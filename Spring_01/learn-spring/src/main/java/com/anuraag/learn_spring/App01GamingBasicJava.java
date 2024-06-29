package com.anuraag.learn_spring;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game=new SuperContra();
//        var game=new MarioGame();
        var game=new PacManGame();
        var gameRunner=new GameRunner(game);

        gameRunner.run();
    }
}
