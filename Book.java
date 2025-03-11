package edu.monmouth.hw2;
public class Book implements LibraryItem {
    private String title;
    private String author;
    private int pages;
    private StatusType status;

    public Book(String title, String author, int pages) throws BookException{
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        this.status = StatusType.ONSHELF;
    }

    public void setTitle(String title) throws BookException{
        if(title == null || title.length() == 0) {
            throw new BookException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) throws BookException{
        if(author == null || author.length() == 0) {
            throw new BookException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public void setPages(int pages) throws BookException {
        if(pages < BookConstants.MIN_PAGES) {
            throw new BookException("Pages should be >= "+BookConstants.MIN_PAGES)
        }
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return status == StatusType.ONSHELF;
    }

    @Override
    public void borrowItem() {
        if(isAvailable()) {
            status = StatusType.BORROWED;
        }
    }

    @Override
    public void returnItem() {
        status = StatusType.ONSHELF;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author + ", Pages: " + pages + ", Status: " + status; 
    }
}

