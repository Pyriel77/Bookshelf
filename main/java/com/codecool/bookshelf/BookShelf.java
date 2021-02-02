package com.codecool.bookshelf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.lang.Math.min;

public class BookShelf {


    List<Book> books = new ArrayList<>();



    List<Book> ybooks = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }



    public List<Book> getBook (int year) {
        for (int i = 0; i < books.size(); i++) {
            if( year == books.get(i).getReleaseYear()) {
                ybooks.add(books.get(i));
            }
        }
        return ybooks;
    }

    public String getLightestAuthor() {

        Book promp = books.stream().min(Comparator.comparing(Book::getWeightInGrams)).get();


        return promp.getAuthor();
    }

    public String getAuthorOfMostWrittenPages() {

        return "";
    }


}
