package javaexamples;

public class MultiThreadingExamples {

    static int N;
    volatile static int counter = 1 ;

    MultiThreadingExamples(int N){
        this.N = N ;
    }
    public synchronized void printEvenNumbers() {
       while(counter <= N){
           if(counter % 2 == 0){
               System.out.println( Thread.currentThread().getName() + counter);
               counter++;
               notifyAll();
           } else{
               try {
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
    private synchronized void printOddNumbers(){
        while(counter <= N){
            if(counter % 2 == 1){
                System.out.println( Thread.currentThread().getName() + counter);
                counter++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args){

        MultiThreadingExamples classObj = new MultiThreadingExamples(10);

        Thread threadOne = new Thread(() -> {
            classObj.printEvenNumbers();
        });
        threadOne.setName("Even:");


        Thread threadTwo = new Thread(() -> {
            classObj.printOddNumbers();
        });
        threadTwo.setName("Odd:");

        threadOne.start();
        threadTwo.start();
    }
}
