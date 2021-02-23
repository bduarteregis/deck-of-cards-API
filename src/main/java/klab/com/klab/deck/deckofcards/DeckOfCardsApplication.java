package klab.com.klab.deck.deckofcards;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
public class DeckOfCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeckOfCardsApplication.class, args);
	}

}
