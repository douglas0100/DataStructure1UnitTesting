package com.diegopinheiro.estruturadados1.list01;

public class ListNode {
    private int element;
    private ListNode next;

    public ListNode(int element, ListNode next){
        this.element = element;
        this.next = next;
    }

    public ListNode getNext(){
        return this.next;
    }

    public int getElement(){
        return this.element;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof ListNode)){
            return false;
        }
        ListNode anotherNode = (ListNode) object;
        return this.element == anotherNode.element;
    }


}
