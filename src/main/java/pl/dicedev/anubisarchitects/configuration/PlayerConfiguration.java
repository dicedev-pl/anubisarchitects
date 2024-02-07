package pl.dicedev.anubisarchitects.configuration;

import pl.dicedev.anubisarchitects.roles.Player;

public class PlayerConfiguration {

    private Player player;

    public PlayerConfiguration() {
        this.player = new Player(1, "Anubis");
    }

    public Player getPlayer() {
        return player;
    }
}
