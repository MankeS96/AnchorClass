package com.company;

public class Anchor {
    private Element first;
    private Element last;

    public Anchor(){
        first = null;
        last = null;
    }

    public void insertAtTheFront(int x){
        if (this.first == null){
            first = new Element(x, null, null);
            last = first;
        }else{
            Element element = new Element(x, first, null);
            this.first.prev = element;
            this.first = element;
        }
        display();
    }

    public void insertAtTheEnd(int x){
        if (this.first == null){
            first = new Element(x, null, null);
            last = first;
        }else{
            Element element = new Element(x, null, last);
            this.last.next = element;
            this.last = element;
        }
        display();
    }

    public void removeFirst(){
        if (this.first != null){
            Element element = this.first;
            this.first = this.first.next;
            element = null;
        }
        display();
    }

    private void display() {
        Element element = first;

        if (first == null){
            System.out.println("Lista jest pusta!!");
            return;
        }

        System.out.print("Lista: ");
        while (element != null){
            System.out.print(element.value + " ");
            element = element.next;
        }
        System.out.println();
    }
}
