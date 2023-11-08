public class Philosopher extends Thread {
    private final String name;
    private boolean isHungry = false;
    private int counter;

    public Philosopher(String name) {
        this.name = name;
    }

    public void meditate() {
        if (!isHungry) {
            System.out.println(name + " медитирует");
            isHungry = true;
        }
    }

    public void eat() {
        if (isHungry) {
            System.out.println(name + " ест");
            counter++;
            isHungry = false;
        }
    }

    @Override
    public void run() {
        while (counter < 3) {
            if (isHungry) {
                try {
                    eat();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                meditate();
            }
        }
    }
}