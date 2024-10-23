import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {

    private final int MAX_SIZE = 5;  // Buffer size
    private final Queue<Integer> buffer = new LinkedList<>();
    // buffer - A queue that holds the items produced by the producers and consumed by the consumer
    int objects = 0 ;
    // Producer class
    class Producer extends Thread {
        private final String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int value = 0;
            while (objects<=10) {
                // The buffer is synchronized to prevent multiple threads from accessing it simultaneously,
                // which could lead to inconsistent states.
                synchronized (buffer) {
                    while (buffer.size() == MAX_SIZE) {
                        try {
                            System.out.println(name + " waiting, buffer is full.");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer.add(value);
                    System.out.println(name + " produced " + value);
                    value++;
                    objects++;
                    buffer.notifyAll();  // Notify the consumer thread
                }
                // After producing an item, the producer calls buffer.notifyAll() to wake up any waiting threads
                // (likely the consumer) so they can proceed.
                try {
                    Thread.sleep(1000);  // Simulate time taken to produce
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Consumer class
    class Consumer extends Thread {

        @Override
        public void run() {
            while (objects<=10) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Consumer waiting, buffer is empty.");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = buffer.remove();
                    System.out.println("Consumer consumed " + value);
                    buffer.notifyAll();  // Notify the producer threads
                }
                try {
                    Thread.sleep(1000);  // Simulate time taken to consume
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Create two producers and one consumer
        Producer producer1 = pc.new Producer("Producer 1");
        Producer producer2 = pc.new Producer("Producer 2");
        Consumer consumer = pc.new Consumer();

        // Start the threads
        producer1.start();
        producer2.start();
        consumer.start();
        try{
            producer1.join();
            producer2.join();
            consumer.join();
            System.out.println("All threads joined successfully");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
