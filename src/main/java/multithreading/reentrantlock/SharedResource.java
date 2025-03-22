package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    ReentrantLock lock = new ReentrantLock();
    public void producer() throws InterruptedException {
        try {
            lock.lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } finally {
            lock.unlock();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
}
