package com.automation.librarymanagementsystem;

public class Magazine extends LibraryItems {

    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(User user) {
        isBorrowed = true;
        System.out.println(user+" is borrowed the magazine "+getTitle());
    }
}
