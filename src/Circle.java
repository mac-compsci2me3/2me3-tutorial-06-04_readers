import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.decode(color));
        g.drawOval(50, 50, (int)(radius * 2), (int)(radius * 2)); // Example coordinates
        g.fillOval(50, 50, (int)(radius * 2), (int)(radius * 2));
    }
}