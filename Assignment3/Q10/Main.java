import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumerWaitNotify {
    static class Buffer {
        private final Queue<Integer> q = new LinkedList<>();
        private final int capacity;
        public Buffer(int capacity) { this.capacity = capacity; }

        public synchronized void produce(int val) throws InterruptedException {
            while (q.size() == capacity) wait();
            q.add(val);
            System.out.println("Produced: " + val);
            notifyAll();
        }

        public synchronized int consume() throws InterruptedException {
            while (q.isEmpty()) wait();
            int val = q.remove();
            System.out.println("Consumed: " + val);
            notifyAll();
            return val;
        }
    }

    public static void main(String[] args) {
        Buffer b = new Buffer(3);
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                try { b.produce(i); Thread.sleep(200); } catch (InterruptedException e) {}
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                try { b.consume(); Thread.sleep(400); } catch (InterruptedException e) {}
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
