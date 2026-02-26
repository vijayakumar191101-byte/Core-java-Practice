package Collection_ExceptionHandling_multithreading_java8;

class mytask implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Running.........");
    }
}

public class Thread_using_Runnable {
    static void main(String[] args) {
        Thread t = new Thread(new mytask());
        t.start();
    }
}
