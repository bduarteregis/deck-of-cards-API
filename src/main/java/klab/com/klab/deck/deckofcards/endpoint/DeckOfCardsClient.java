package klab.com.klab.deck.deckofcards.endpoint;

import klab.com.klab.deck.deckofcards.model.Baralho;
import klab.com.klab.deck.deckofcards.model.HandsOn;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(url = "https://deckofcardsapi.com/api/deck", name = "deckofcards")

public interface DeckOfCardsClient {
    @GetMapping("/new/shuffle/")
    Baralho novoBaralho();

    @GetMapping("/{id}/draw/")
    HandsOn compraCartas(@PathVariable String id, @RequestParam("count") String quantidade);
}