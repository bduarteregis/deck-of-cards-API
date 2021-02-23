package klab.com.klab.deck.deckofcards.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component

public class HandsOnJSON {

    public ArrayList<String> cartas = new ArrayList<>();
    public int quantidade;

}