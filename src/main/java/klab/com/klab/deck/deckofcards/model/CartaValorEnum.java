package klab.com.klab.deck.deckofcards.model;

public enum CartaValorEnum {

    SPADES("de Espadas"),
    CLUBS("de Paus"),
    HEARTS("de Copas"),
    DIAMONDS("de Ouro");

    private String naipe;

    CartaValorEnum(String traduzNaipe) {
        this.naipe = traduzNaipe;
    }

    public String getNaipeTraduzido() {
        return this.naipe;
    }

}
