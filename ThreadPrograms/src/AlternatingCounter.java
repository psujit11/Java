public class AlternatingCounter {
    private int counter = 0;
    private boolean isEvenTurn = true;

    public static void main(String[] args) {
        AlternatingCounter counter = new AlternatingCounter();
        Thread evenThread = new Thread(counter::printEvenNumbers);
        Thread oddThread = new Thread(counter::printOddNumbers);

        evenThread.start();
        oddThread.start();
    }

    public synchronized void printEvenNumbers() {
        while (counter < 10) {
            while (!isEvenTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + counter);
            counter++;
            isEvenTurn = false;
            notifyAll();
        }
    }

    public synchronized void printOddNumbers() {
        while (counter < 10) {
            while (isEvenTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + counter);
            counter++;
            isEvenTurn = true;
            notifyAll();
        }
    }
}
