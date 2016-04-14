package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild, rightChild;

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

    public void add(String nameOfNewNode) {
        int stringOrder = name.compareTo(nameOfNewNode);
        if(stringOrder >= 0) {
            if(leftChild == null)
                leftChild = new Node(nameOfNewNode);
            else
                leftChild.add(nameOfNewNode);
        }
        else {
            if(rightChild == null)
                rightChild = new Node(nameOfNewNode);
            else
                rightChild.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> nameList = new ArrayList<>();
        if(leftChild != null)
            nameList.addAll(leftChild.names());
        nameList.add(name);
        if(rightChild != null)
            nameList.addAll(rightChild.names());
        return nameList;
    }
}
