public class NumberPrinter implements Runnable {
    private final int limit;
    private final boolean printEven;

    public NumberPrinter(int limit, boolean printEven) {
        this.limit = limit;
        this.printEven = printEven;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (printEven && i % 2 == 0) {
                System.out.println(i);
            } else if (!printEven && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Create a thread for printing even numbers
        Thread evenThread = new Thread(new NumberPrinter(10, true));
        // Create a thread for printing odd numbers
        Thread oddThread = new Thread(new NumberPrinter(10, false));

        // Start the even number thread

        evenThread.start();
        // Start the odd number thread

        oddThread.start();
    }
}
