package Collection_ExceptionHandling_multithreading_java8;

class Shared{
    int data;
    boolean  available = false;

    synchronized void produce (int value) throws InterruptedException{
        while(available)wait();
        data = value;
        available = true;
        System.out.println("Produced : "+ value);
        notify();
    }
    synchronized int consumer() throws InterruptedException{
        while(!available)wait();
        available=false;
        System.out.println("Consumer : "+ data);
        notify();
        return data;
    }
}

class producer extends  Thread
{
    private Shared shared;
    producer(Shared shared){
        this.shared = shared;
    }

    @Override
    public void run() {
        try{
            for (int i =0;i<10;i++){
                shared.produce(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{
    private Shared shared;

    Consumer(Shared shared){
        this.shared = shared;
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++){
                shared.consumer();
                Thread.sleep(800);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Producer_Consumer {
    static void main(String[] args) {
        Shared shared = new Shared();

        producer p = new producer(shared);
        Consumer c = new Consumer(shared);

        p.start();
        c.start();
    }
}