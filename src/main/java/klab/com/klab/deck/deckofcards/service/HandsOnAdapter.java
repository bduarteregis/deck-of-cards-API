package klab.com.klab.deck.deckofcards.service;

import klab.com.klab.deck.deckofcards.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class HandsOnAdapter {

    private String traduzCarta(Carta carta) {
        String valor = carta.value;
        if (valor.matches("[A-Z]+")) {
            valor = CartaNaipeEnum.valueOf(carta.value).getValor();
        }
        return valor + " " + CartaValorEnum.valueOf(carta.suit).getNaipeTraduzido();
    }

    public HandsOnJSON executa(HandsOn handsOn) {

        HandsOnJSON handsOnJSON = new HandsOnJSON();

        for(Carta carta : handsOn.cards) {
            handsOnJSON.cartas.add(traduzCarta(carta));
        }

        handsOnJSON.quantidade = handsOnJSON.cartas.size();
        return handsOnJSON;
    }

}
