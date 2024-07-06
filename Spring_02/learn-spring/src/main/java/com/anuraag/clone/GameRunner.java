package com.anuraag.clone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    //concept of constructor Injection. Autowiring is happening here
//Auto wiring using the Qualifier annotation
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
    }
}
