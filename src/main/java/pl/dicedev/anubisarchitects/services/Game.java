package pl.dicedev.anubisarchitects.services;

import pl.dicedev.anubisarchitects.configuration.PlayerConfiguration;
import pl.dicedev.anubisarchitects.roles.Player;

import java.util.Scanner;

public class Game {

    private final Scanner keyboard;
    private final PlayerConfiguration playerConfiguration;

    public Game() {
        this.keyboard = new Scanner(System.in);
        this.playerConfiguration = new PlayerConfiguration();
    }

    public boolean running() {
        UserMenu.show();
        String userChoice = keyboard.nextLine();
        if ("x".equalsIgnoreCase(userChoice)) {
            return false;
        } else if ("p".equalsIgnoreCase(userChoice)) {
            Player player = playerConfiguration.getPlayer();
            System.out.println(player);
            System.out.println();
        }
        return true;
    }
}
