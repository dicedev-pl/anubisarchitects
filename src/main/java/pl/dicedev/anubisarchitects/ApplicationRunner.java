package pl.dicedev.anubisarchitects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.dicedev.anubisarchitects.services.Game;

@SpringBootApplication
public class ApplicationRunner {

//	public static void main(String[] args) {
//		SpringApplication.run(ApplicationRunner.class, args);
//	}

	public static void main(String[] args) {
		Game game = new Game();
		for (; ;) {
			if (!game.running()) {
				break;
			}
		}
	}
}
