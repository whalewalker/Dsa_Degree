package com.algo;

public class Validation {
    private Card[] cards;
    private String min;
    private String  max;
    private Processor processor;

    public Validation() {
        min = "1";
        max = "above";
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public String  getMax() {
        return max;
    }

    public void setMax(String  max) {
        this.max = max;
    }


    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }


}
