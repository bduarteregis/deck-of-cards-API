package klab.com.klab.deck.deckofcards.service;

import klab.com.klab.deck.deckofcards.model.Carta;
import klab.com.klab.deck.deckofcards.model.HandsOn;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class HandsOnAdapter {

    private String traduzValor(String valor) {

        if(valor.equals("KING")) {
            return "Rei";
        } if(valor.equals("QUEEN")) {
            return "Rainha";
        } if(valor.equals("ACE")) {
            return "Ás";
        } if(valor.equals("JACK")) {
            return "Valete";
        }
        return valor;
    }

    private String traduzNaipe(String naipe) {

        if(naipe.equals("SPADES")) {
            return "de Espadas";
        } if(naipe.equals("CLUBS")) {
            return "de Paus";
        } if(naipe.equals("HEARTS")) {
            return "de Copas";
        }
        return "de Ouro";
    }

    private String traduzCarta(Carta carta) {
        return this.traduzValor(carta.value) + " " + this.traduzNaipe(carta.suit);
    }

    public ArrayList<String> executa(HandsOn handsOn) {

        ArrayList<String> cartas = new ArrayList<>();

        for(Carta carta : handsOn.cards) {
            cartas.add(traduzCarta(carta));
        }

        return cartas;
    }

}
