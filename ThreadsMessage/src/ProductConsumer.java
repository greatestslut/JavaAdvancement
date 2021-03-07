class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.consumeProduct();
        }
    }
}

class Producer extends Thread{
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.produceProduct();
        }
    }
}
class Buffer{
    private int Num;

    public Buffer(int num) {
        Num = num;
    }

    public void produceProduct() {
        synchronized (this) {
            if (Num<20) {
                Num++;
                System.out.println(Thread.currentThread().getName()+" produce No."+ Num);
            } else {
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consumeProduct() {
        synchronized (this) {
            if (Num>0) {
                System.out.println(Thread.currentThread().getName()+" consume No."+ Num);
                Num--;

            } else {
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class ProductConsumer {
    public static void main(String[] args) {
        // shared resource
        Buffer buffer = new Buffer(0);

        //init consumer-producer thread
        Consumer consumer1 = new Consumer(buffer);
        consumer1.setName("C-1");
        Consumer consumer2 = new Consumer(buffer);
        consumer2.setName("C-2");

        Producer producer = new Producer(buffer);
        producer.setName("P-1");

        //Thread Start
        consumer1.start();
//        consumer2.start();

        producer.start();

    }
}
