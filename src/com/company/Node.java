package com.company;

public class Node {
    int value;
    Node prevNode;
    Node nextNode;

    Node(int value){
        this.value=value;
        nextNode=null;
    }

}
