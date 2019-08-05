package com.example.myapplication.builder2;

public class BuilderActivity {

    Card card = new Card.CardBuilder("VISA", "0000 1111 2222 3333")
            .credit(false)
            .expires(2030)
            .name("alberto")
            .build();

    System.out.println(card);

    Card card2 = new Card.CardBuilder("MASTERCAR",  "0000 0000 0000 0000")
            .build();
    System.out.println(card2);
}
