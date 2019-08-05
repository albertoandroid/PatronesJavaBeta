package com.example.myapplication.behavioral.memento;

public final class ArticleMemento {

    private long id;
    private String title;
    private String text;

    public ArticleMemento(long id, String title, String text) {
        super();
        this.id = id;
        this.title = title;
        this.text = text;
    }

    /*
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
    */
}
