package klab.com.klab.deck.deckofcards.service;

import klab.com.klab.deck.deckofcards.endpoint.DeckOfCardsClient;
import klab.com.klab.deck.deckofcards.model.Baralho;
import klab.com.klab.deck.deckofcards.model.HandsOn;
import klab.com.klab.deck.deckofcards.model.HandsOnJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BaralhoService {

    @Autowired
    public DeckOfCardsClient deckOfCardsClient;
    @Autowired
    public HandsOnAdapter handsOnAdapter;
    @Autowired
    public HandsOnJSON handsOnJSON;

    public HandsOnJSON executa(String quantidade) {
        Baralho baralho = deckOfCardsClient.novoBaralho();
        HandsOn handsOn = deckOfCardsClient.compraCartas(baralho.deck_id, quantidade);
        return handsOnAdapter.executa(handsOn);
    }

}
