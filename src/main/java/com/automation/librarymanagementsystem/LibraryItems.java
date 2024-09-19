package com.automation.librarymanagementsystem;

public abstract class LibraryItems {
    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;
    public abstract void borrowedItem(User user);

    public LibraryItems(String title, String author, String serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
