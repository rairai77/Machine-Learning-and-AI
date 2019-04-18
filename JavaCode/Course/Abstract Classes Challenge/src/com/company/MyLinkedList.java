package com.company;

public class MyLinkedList {
    private ListItem head;
    private ListItem current;

    public MyLinkedList() {
        this.head = null;
        this.current = head;
    }

    public boolean add(ListItem itemToAdd){
        if(head == null){
            this.head = itemToAdd;
            this.current = this.head;
            System.out.println("Set Head");
            return true;
        }else if(itemToAdd.compareTo(head)<0){
            itemToAdd.setRight(head);
            itemToAdd.getRight().setLeft(itemToAdd);
            this.head = itemToAdd;
            System.out.println("Reset Head");
            this.current = this.head;
            return true;
        } else{
            boolean stop = false;
            ListItem tempCurrent = head;
            while(!stop){
                if(tempCurrent.getRight() == null){
                    tempCurrent.setRight(itemToAdd);
                    tempCurrent.getRight().setLeft(tempCurrent);
                    System.out.println("Set Last");
                    return true;
                } else if(itemToAdd.compareTo(tempCurrent.getRight()) < 0){
                    itemToAdd.setLeft(tempCurrent);
                    itemToAdd.setRight(tempCurrent.getRight());
                    tempCurrent.getRight().setLeft(itemToAdd);
                    tempCurrent.setRight(itemToAdd);
                    System.out.println("SET");
                    return true;
                }
                tempCurrent = tempCurrent.getRight();
            }
        }
        return false;
    }
    public void next(){
        if(current.getRight()!=null){
            current = current.getRight();
        }
    }
    public void previous(){
        if(current.getLeft()!=null){
            current=current.getLeft();
        }
    }
    public void printIteratedValue(){
        System.out.println(current.getValue());
    }
    public ListItem getCurrent() {
        return current;
    }
}
