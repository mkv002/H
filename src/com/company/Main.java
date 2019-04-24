package com.company;

public class Main {

    public static void main(String[] args) {
	MyLinkedList list =new MyLinkedList();

	list.add(12);
        list.add(11);
        list.add(0);
        list.add(6);
        list.add(7);
        list.add(70);

        list.show();

        //Необходимо проверить граничные случаи - с head и tail
        list.removeByIndex(1);
       // list.show();
    }
}
