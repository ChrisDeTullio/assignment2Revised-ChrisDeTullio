package edu.monmouth.hw2;
public interface LibraryItem {
    String getTitle();
    boolean isAvailable();
    void borrowItem();
    void returnItem();
}

