package edu.monmouth.hw2;
public class LibraryNode {
    private LibaryItem item;
    private LibraryNode next;

    public LibraryNode(LibraryItem item) {
        this.item = item;
        this.next = null;
    }

    public LibraryItem getItem() {
        return item;
    }

    public LibraryNode getNext() {
        return next;
    }

    public void setNext(LibraryNode next) {
        this.next = next;
    }
}
