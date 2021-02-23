package klab.com.klab.deck.deckofcards.model;

public enum CartaNaipeEnum {

    KING("Rei"),
    QUEEN("Rainha"),
    JACK("Valete"),
    ACE("Ás");

    private String valor;

    CartaNaipeEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
    
}
