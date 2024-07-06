package com.anuraag.clone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContra implements GamingConsole {
    public void up(){
        System.out.println("UP");
    }
    public void down(){
        System.out.println("DOWN");
    }
    public void left(){
        System.out.println("BACK");
    }
    public void right(){
        System.out.println("SHOOT");
    }
}
