public class Main {

    public static void main(String[] args) {
        Philosopher p1 = new Philosopher("1 философ");
        Philosopher p2 = new Philosopher("2 философ");
        Philosopher p3 = new Philosopher("3 философ");
        Philosopher p4 = new Philosopher("4 философ");
        Philosopher p5 = new Philosopher("5 философ");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}