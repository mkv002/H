package com.company;

public class MyLinkedList {
    Node head;
    Node tail;
    int size=0;

    MyLinkedList(){

    }

    public void add(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        else {
            Node helper=tail;
            helper.nextNode=node;
            node.prevNode=helper;
            tail=node;
        }
        size++;
    }

    public void show(){
        Node current=head;
        while (current!=null){
            System.out.print(current.value+" ");
            current=current.nextNode;
        }
    }

    public void removeByIndex(int index){

    }

}
