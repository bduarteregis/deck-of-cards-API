package klab.com.klab.deck.deckofcards.model;

public enum CardsValueEnum {

    KING("Rei"),
    QUEEN("Rainha"),
    JACK("Valete"),
    ACE("Ás");

    private String valor;

    CardsValueEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
    
}
