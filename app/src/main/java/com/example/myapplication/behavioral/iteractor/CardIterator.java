package com.example.myapplication.behavioral.iteractor;

public class CardIterator implements Iterator {

    private Card[] cards;
    private int position;

    public CardIterator( Card[] cards){
        this.cards = cards;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position>= cards.length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public Object currenItem() {
        return cards[position];
    }
}
