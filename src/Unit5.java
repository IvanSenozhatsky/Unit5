import java.util.Random;
import java.util.Scanner;

public class Unit5 {
    public static void main(String[] args) {

    }
}

class Computer {
    String CPU;
    int frequency;
    int coresCount;
    int ramSize;
    int resource;

    public Computer(String CPU, int frequency, int coresCount, int ramSize, int resource) {
        this.CPU = CPU;
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.ramSize = ramSize;
        this.resource = resource;
    }

    public String info() {
        return "Computer:\n" +
                "  CPU: " + CPU + "\n" +
                "  frequency: " + frequency + " MHz\n" +
                "  cores: " + coresCount + "\n" +
                "  RAM: " + ramSize + " MB\n" +
                "  resource: " + resource + " I/O\n";

    }

    public void On() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(2);
        System.out.println("enter a number (0 or 1)");
        int choose = sc.nextInt();
        if (choose == rand) {
            System.out.println("computer turned on");
            resource--;
        } else {
            System.out.println("computer crashed");
            resource = 0;
        }
    }

    public void Off() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(2);
        System.out.println("enter a number (0 or 1)");
        int choose = sc.nextInt();
        if (choose == rand) {
            System.out.println("computer turned off");
        } else {
            System.out.println("computer crashed");
            resource = 0;
        }
    }

    public void CheckResource() {
        if (resource == 0) {
            System.out.println("computer crashed");
        }
    }
}
