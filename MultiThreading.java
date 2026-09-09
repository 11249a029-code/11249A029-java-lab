class MultiThreading extends Thread {

    private String threadName;

    MultiThreading(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
        }
    }

    public static void main(String[] args) {

        MultiThreading t1 = new MultiThreading("Thread 1");
        MultiThreading t2 = new MultiThreading("Thread 2");

        t1.start();
        t2.start();
    }
}