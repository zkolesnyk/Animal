import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Circle {
    private double x; // центр по x
    private double y; // центр по y
    private double r; // радиус

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }

    public void moveCircle() {
        int min = -99;
        int max = 99;

        double x = ThreadLocalRandom.current().nextInt(min, max + 1);
        double y = ThreadLocalRandom.current().nextInt(min, max + 1);

        this.x += x;
        this.y += y;
    }

    public void zoomCircle(double r) {
        this.r *= r;
    }

    private double squareCircle() {
        return Math.PI * r * r;
    }

    public boolean equalsCircle(Circle cir) {
        return this.squareCircle() == cir.squareCircle();
    }

    private double lengthCenterCircle(Circle cir) {
        double x = cir.x - this.x;
        double y = cir.y - this.y;
        return Math.sqrt(x * x + y * y);
    }

    public boolean pointsCircle(Circle cir) {
        double inner = (this.r > cir.r) ? this.r - cir.r : cir.r - this.r;
        double outer = this.r + cir.r;

        return this.lengthCenterCircle(cir) == inner || this.lengthCenterCircle(cir) == outer;
    }

    public double lengthCircle() {
        return 2 * Math.PI * this.r;
    }

    public Circle() {
        Scanner in = new Scanner(System.in);

        System.out.print("x:");
        this.x = in.nextDouble();
        System.out.print("y:");
        this.y = in.nextDouble();
        System.out.print("r:");
        this.r = in.nextDouble();
    }

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
