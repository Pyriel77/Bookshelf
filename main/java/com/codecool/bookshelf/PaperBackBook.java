package com.codecool.bookshelf;

public class PaperBackBook extends Book{

private static final int WEIGHTOFPAPERBACK = 20;
private static final int WEIGHTOFPAGEINGRAMS = 10;




    public PaperBackBook(String title, String author, int releaseYear, int numberOfPages, int weightInGrams) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * WEIGHTOFPAGEINGRAMS + WEIGHTOFPAPERBACK);
    }
}
