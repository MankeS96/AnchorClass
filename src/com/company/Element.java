package com.company;

public class Element{
    protected int value;
    protected Element next;
    protected Element prev;

    public Element(int value, Element next, Element prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
