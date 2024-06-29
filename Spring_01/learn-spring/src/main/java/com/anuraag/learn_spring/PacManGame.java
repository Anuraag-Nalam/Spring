package com.anuraag.learn_spring;

public class PacManGame implements GamingConsole{
    public void up(){
        System.out.println("packup");
    }
    public void down(){
        System.out.println("packdown");
    }
    public void left(){
        System.out.println("packleft");
    }
    public void right(){
        System.out.println("packright");
    }
}
