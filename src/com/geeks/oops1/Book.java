package com.geeks.oops1;

public class Book  extends Product{
    private String author;
    private String genre;
    public String getAuthor() {
        return authour;
    }
    public void setAuthor(String author) {
        this.authour = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void print() {
        //super ==> to access base class members
        super.print();
        System.out.println("Author : "+authour);
        System.out.println("Genre : "+genre);
    }

}
