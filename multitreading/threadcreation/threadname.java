package MultiThreading.ThreadCreation;

import java.util.Random;

public class ColourThread implements Runnable {

    public void run() {

        String colours[] = {
                "white",
                "blue",
                "black",
                "green",
                "red",
                "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red colour found. Thread stopped.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread(new ColourThread());

        t.start();
    }
}