package klab.com.klab.deck.deckofcards.model;

public enum CardsSuitEnum {

    SPADES("de Espadas"),
    CLUBS("de Paus"),
    HEARTS("de Copas"),
    DIAMONDS("de Ouro");

    private String naipe;

    CardsSuitEnum(String traduzNaipe) {
        this.naipe = traduzNaipe;
    }

    public String getNaipeTraduzido() {
        return this.naipe;
    }

}
