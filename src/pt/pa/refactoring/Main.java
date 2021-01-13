package pt.pa.refactoring;

public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();

        System.out.println("Enqueuing...");
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
            q.enqueue(i);
        }
        System.out.println();

        //does it make sense to allow the following? Not really, so Refactor!
        //q.add(2, 3);

        System.out.println("At front of queue: " + q.front());

        System.out.println("Dequeuing all elements:");
        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
