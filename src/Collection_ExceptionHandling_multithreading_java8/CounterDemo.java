package Collection_ExceptionHandling_multithreading_java8;

class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }
}
class mythread extends Thread{
    private Counter counter;
    mythread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i<10;i++){
            counter.increment();
        }
    }
}

public class CounterDemo {
    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new mythread(counter);
        Thread t2 = new mythread(counter);

        t1.start();
//        t2.start();

        t1.join();
//        t2.join();

        System.out.println("Final Count = " + counter.count);
    }
}
