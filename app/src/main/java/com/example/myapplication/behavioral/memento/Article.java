package com.example.myapplication.behavioral.memento;

public class Article {

    private long id;
    private String title;
    private String text;

    public Article(long id, String title,  String text) {
        super();
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(id, title, text);
        return memento;
    }

    public void restore(ArticleMemento memento){
        this.id = memento.getId();
        this.title = memento.getTitle();
        this.text = memento.getText();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
