package com.company;

public class Main {

    public static void main(String[] args) {
        Anchor anch = new Anchor();

        anch.insertAtTheEnd(2);
        anch.removeFirst();

        anch.insertAtTheEnd(3);
        anch.insertAtTheFront(4);

        anch.insertAtTheFront(12);
        anch.insertAtTheEnd(1);

        anch.removeFirst();
    }
}
