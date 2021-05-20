package trienkhai_queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedQueue abc = new MyLinkedQueue();
        abc.enqueue(10);
        abc.enqueue(20);
        abc.dequeue();
        abc.dequeue();
        abc.enqueue(30);
        abc.enqueue(40);
        abc.enqueue(50);
        System.out.println("Dequeued item is " + abc.dequeue().key);
    }
}
