public class ThreadPriorityExample {

    public static void main(String[] args) {
        // Create a thread with the lowest priority
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        lowPriorityThread.start();

        // Create a thread with the highest priority
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("High Priority Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        highPriorityThread.start();

        // Create a thread with normal priority
        Thread normalPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Normal Priority Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        normalPriorityThread.start();
    }
}
