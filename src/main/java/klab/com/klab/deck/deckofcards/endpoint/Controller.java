package klab.com.klab.deck.deckofcards.endpoint;

import klab.com.klab.deck.deckofcards.model.Baralho;
import klab.com.klab.deck.deckofcards.service.BaralhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class Controller {

    @Autowired
    public BaralhoService baralhoService;

    @GetMapping("/deck/seleciona/")
    public ResponseEntity consultaDeckOfCards() {
        return new ResponseEntity(baralhoService.executa(), HttpStatus.OK);
    }

}