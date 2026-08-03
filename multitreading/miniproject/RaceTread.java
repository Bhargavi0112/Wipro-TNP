package MultiThreading.MiniProject;

public class RaceThread extends Thread {

    private static boolean winnerFound = false;

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (winnerFound)
                return;

            System.out.println(getName() + " : " + i + " meters");

            // Hare sleeps after 60 meters
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!winnerFound) {
            winnerFound = true;
            System.out.println("\nWinner is " + getName());
        }
    }
}