package klab.com.klab.deck.deckofcards.service;

import klab.com.klab.deck.deckofcards.model.CardsValueEnum;
import klab.com.klab.deck.deckofcards.model.Carta;
import klab.com.klab.deck.deckofcards.model.HandsOn;
import klab.com.klab.deck.deckofcards.model.CardsSuitEnum;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class HandsOnAdapter {

    private String traduzCarta(Carta carta) {
        String valor = carta.value;
        if (valor.matches("[A-Z]+")) {
            valor = CardsValueEnum.valueOf(carta.value).getValor();
        }
        return valor + " " + CardsSuitEnum.valueOf(carta.suit).getNaipeTraduzido();
    }

    public ArrayList<String> executa(HandsOn handsOn) {

        ArrayList<String> cartas = new ArrayList<>();

        for(Carta carta : handsOn.cards) {
            cartas.add(traduzCarta(carta));
        }

        return cartas;
    }

}
