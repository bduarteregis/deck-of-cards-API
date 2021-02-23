package klab.com.klab.deck.deckofcards.service;

import klab.com.klab.deck.deckofcards.endpoint.DeckOfCardsClient;
import klab.com.klab.deck.deckofcards.model.Baralho;
import klab.com.klab.deck.deckofcards.model.HandsOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class BaralhoService {

    @Autowired
    public DeckOfCardsClient deckOfCardsClient;
    @Autowired
    public HandsOnAdapter handsOnAdapter;

    public ArrayList<String> executa(String quantidade) {
        Baralho baralho = deckOfCardsClient.novoBaralho();
        HandsOn handsOn = deckOfCardsClient.compraCartas(baralho.deck_id, quantidade);
        ArrayList<String> cartas = handsOnAdapter.executa(handsOn);
        return cartas;
    }

}
