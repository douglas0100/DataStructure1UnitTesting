package com.diegopinheiro.estruturadados1.list01;

import javax.lang.model.element.Element;

public class SinglyLinkedList {
    private ListNode head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addFirst(int element){
        ListNode newHead;
        newHead = new ListNode(element, this.head);
        this.head = newHead;
    }

    public ListNode search(int element){
        ListNode searchNode = this.head;
        while(searchNode != null){
            if(searchNode.getElement() == element){
                return searchNode;
            }
            searchNode = searchNode.getNext();
        }
        return null;
    }

    public int size(){
        ListNode node = this.head;
        int size = 0;
        while(node != null){
            size = size + 1;
            node = node.getNext();
        }
        return size;
    }

    public void addLast(int element) {
        ListNode lastNode = new ListNode(element, null);
        if(this.isEmpty()){
            this.head = lastNode;
            return;
        }
        ListNode currentNode = this.head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(lastNode);
    }

    public void reverse() {
        if(this.isEmpty()){
            return;
        }
        ListNode a = this.head.getNext();
        ListNode b = this.head;
        while(a != null){
            ListNode temp = a.getNext();
            a.setNext(b);
            b = a;
            a = temp;
        }
        this.head.setNext(null);
        this.head = b;
    }

    public boolean isOrdered(boolean ascending) {
        if(this.isEmpty()){
            return true;
        }
        if(ascending){
            return isAscending();
        }else{
            return isDescending();
        }
    }

    public boolean isAscending(){
        ListNode currentNode = this.head;
        while(currentNode.getNext() != null){
            if(!(currentNode.getElement() < currentNode.getNext().getElement())){
                return false;
            }
            currentNode = currentNode.getNext();
        }
        return true;
    }

    public boolean isDescending(){
        ListNode currentNode = this.head;
        while(currentNode.getNext() != null){
            if(!(currentNode.getElement() > currentNode.getNext().getElement())){
                return false;
            }
            currentNode = currentNode.getNext();
        }
        return true;
    }

    public void delete(ListNode nodeDelete) {
        if(this.isEmpty()){
            return;
        }
        ListNode currentNode = this.head;
        while(currentNode != null){
            if(currentNode.getNext().equals(nodeDelete)){
                ListNode nextNode = currentNode.getNext();
                currentNode.setNext(nextNode.getNext());
                return;
            }
            currentNode = currentNode.getNext();
        }
    }
    
}
