package com.company;

public class Anchor {

    private Element first = null;
    private Element last = null;

    public void insertAtTheFront(int value) {
        if (first == null) {
            setHead(value);
        } else {
            first = Element.next(value, first);
        }
        display();
    }

    public void insertAtTheEnd(int value) {
        if (first == null) {
            setHead(value);
        } else {
            last = Element.last(value, last);
        }
        display();
    }

    private void setHead(int value) {
        first = Element.first(value);
        last = first;
    }

    public void removeFirst() {
        if (first != null) {
            first = first.remove();
        }
        display();
    }

    private void display() {
        Element element = first;

        if (first == null) {
            System.out.println("Lista jest pusta!!");
            return;
        }

        System.out.print("Lista: ");
        while (element != null) {
            System.out.print(element);
            element = element.remove();
        }
        System.out.println();
    }
}
