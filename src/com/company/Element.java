package com.company;

public class Element {

    private final int value;

    private Element next;
    private Element prev;

    private Element(int value, Element next, Element prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public static Element first(int value) {
        return new Element(value, null, null);
    }

    public static Element next(int value, Element next) {
        Element element = new Element(value, next, null);
        next.prev = element;
        return element;
    }

    public static Element last(int value, Element prev) {
        Element element = new Element(value, null, prev);
        prev.next = element;
        return element;
    }

    public Element remove() {
        return next;
    }

    @Override
    public String toString() {
        return value + " ";
    }

}