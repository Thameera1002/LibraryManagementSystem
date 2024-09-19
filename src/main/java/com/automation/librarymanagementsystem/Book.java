package com.automation.librarymanagementsystem;

public class Book extends LibraryItems {

    public Book(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(User user) {
        isBorrowed = true;
        System.out.println(user+" is borrowed the book "+getTitle());
    }
}
