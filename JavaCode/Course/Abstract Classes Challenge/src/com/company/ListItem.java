package com.company;

public abstract class ListItem {
    private ListItem left;
    private ListItem right;
    private String value;

    public ListItem(String value) {
        this.value = value;
    }

    public abstract int compareTo(ListItem other);

    public void setLeft(ListItem left) {
        this.left = left;
    }
    public void setRight(ListItem right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }
    public ListItem getLeft() {
        return left;
    }
    public ListItem getRight() {
        return right;
    }
}
