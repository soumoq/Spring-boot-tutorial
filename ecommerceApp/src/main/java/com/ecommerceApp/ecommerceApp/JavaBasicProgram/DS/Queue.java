package com.ecommerceApp.ecommerceApp.JavaBasicProgram.DS;

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(23);
        queue.dequeue();
        queue.enqueue(21);
        queue.dequeue();
        queue.showQueue();
    }
}

class QueueImpl {
    int front, rear;
    int queue[];
    int size;

    QueueImpl(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear >= size);
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int element = queue[front];
        front++;
        return element;
    }

    public void showQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + "");
        }
    }

}
