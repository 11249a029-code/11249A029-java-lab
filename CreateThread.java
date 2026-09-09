class CreateThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }

    public static void main(String[] args) {
        CreateThread t = new CreateThread();

        t.start();
    }
}