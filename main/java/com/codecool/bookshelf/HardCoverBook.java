package com.codecool.bookshelf;

public class HardCoverBook extends Book{

    private static final int WEIGHTOFHARDCOVER = 100;
    private static final int WEIGHTOFPAGEINGRAMS = 10;


    public HardCoverBook(String title, String author, int releaseYear, int numberOfPages, int weightInGrams) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * WEIGHTOFPAGEINGRAMS + WEIGHTOFHARDCOVER);
    }
}
