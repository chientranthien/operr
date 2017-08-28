package com.operr.assignment.util;

/**
 * Created by chien on 8/28/17.
 * This class represent singly linked list
 */
public class LinkedList {
    private Node head;

    private int size;


    public int getSize() {
        return size;
    }

    /**
     * add element at the end of the linked list
     *
     * @param element
     */
    public void append(int element) {
        if (size == 0) {
            head = new Node(element);
        } else {
            Node last = get(size - 1);

            Node newNode = new Node(element);
            last.next = newNode;
        }
        size++;
    }

    /**
     * remove the last element of the linked list
     */
    public void remove() {
        unlink(size - 1);
    }


    public void removeIfGreaterThan(int val) {
        removeWithCondition(val, (val1, val2) -> val1 > val2);
    }

    public void removeWithCondition(int val, CompareOperator compareOperator) {
        if (size == 0)
            return;

        Node currentNode = head;
        Node prevNode = null;
        while (currentNode.next != null) {
            if (compareOperator.compare(currentNode.value, val)) {
                unlink(prevNode, currentNode);
                currentNode = prevNode != null ? prevNode.next : head;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        if (compareOperator.compare(currentNode.value, val))
            unlink(prevNode, currentNode);
    }

    /**
     * remove currentNode
     *
     * @param prevNode
     * @param currentNode
     */
    private void unlink(Node prevNode, Node currentNode) {

        //if target element is the first element
        if (prevNode == null) {
            head = currentNode.next;
            currentNode.next = null;

        }
        //if target element is the last element
        else if (currentNode.next == null) {
            prevNode.next = null;
        } else {
            Node nextNode = currentNode.next;
            prevNode.next = nextNode;
            currentNode.next = null;
        }
        size--;
    }

    /**
     * remove element at index
     *
     * @param index
     */
    private void unlink(int index) {
        if (!isValidIndex(index))
            return;

        Node currentNode = head;
        Node prevNode = null;

        //if target element is the first element
        if (index == 0)
            unlink(prevNode, currentNode);
        else {
            prevNode = get(index - 1);
            currentNode = prevNode.next;
            unlink(prevNode, currentNode);
        }
    }

    private boolean isValidIndex(int index) {
        if (index < 0 || index >= size)
            return false;
        return true;
    }

    /**
     * get a element at index
     *
     * @param index
     * @return
     */
    private Node get(int index) {
        if (!isValidIndex(index))
            return null;

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    /**
     * convert linked list to array
     *
     * @return
     */
    public int[] toArray() {
        int[] array = new int[size];
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            array[i] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }


    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

    }
}
