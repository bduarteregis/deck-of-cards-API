package klab.com.klab.deck.deckofcards.model;

public class Baralho {

    public Boolean success;
    public String deck_id;
    public Boolean shuffle;
    public Float remaining;

    public String retornoDeckOfCards() {
        return "Consulta{" +
                "Sucesso:'" + this.success + '\'' +
                ", Deck ID='" + this.deck_id + '\'' +
                ", Embaralhado='" + this.shuffle + '\'' +
                ", Cartas no Deck='" + this.remaining + '\'' +
                '}';
    }

}
