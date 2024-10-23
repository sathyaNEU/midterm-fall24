package org.example;

public class MyCircularQueue {
    Integer[] cq;
    int size;
    int front;
    int rear;

    public MyCircularQueue(int n) {
        this.size = n;
        this.cq = new Integer[n];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        // Check if the queue is full
        return (this.front == this.rear + 1) || (this.front == 0 && this.rear == size() - 1);
    }

    public int size() {
        return cq.length;
    }


    public int Front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // Return null when the queue is empty
        }
        return cq[front];
    }

    public int Rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // Return null when the queue is empty
        }
        return cq[rear];
    }

    public boolean enQueue(int x) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        cq[rear] = x;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false; //the queue is empty
        }
        else{
            int val = cq[front];
            cq[front] = null;  // Optional: Clear the dequeued element
            if (front == rear) {
                // The queue becomes empty
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return true; //dequeued element is val, but the operation is successfull, hence returning true
        }
    }

}

