package edu.monmouth.hw2;
public class ListLibraryNode {
    private LibraryNode head;

    public ListLibraryNode() {
        head = null;
    }

    public LibraryNode first() {
        return head;
    }

    public LibraryNode last() {
        if(head == null) {
            return null;
        }
        LibraryNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    public LibraryNode removeFirst() {
        if(head == null) {
            return null;
        }
        LibraryNode removed = head;
        head = head.getNext();
        return removed;
    }

    public void insertEnd(Libraryitem item) {
        LibraryNode newNode = new LibraryNode(item);
        if(head == null) {
            head = newNode;
        } else{
            LibraryNode last = last();
            last.setNext(newNode);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        LibraryNode current = head;
        while (current != null) {
            count ++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LibraryNode current = head;
        while (current != null) {
            sb.append(current.getItem().toString()).append("\n");
            current = current.getNext();
        }
        return sb.toString();
    }
}
