import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Drawing{
    private static Drawing instance;

    private List<Shape> shapes;
    private DrawPanel panel;

    //private Drawing(){}

    private Drawing(){
        shapes = new ArrayList<>();
        JFrame frame = new JFrame("Draw");
        panel = new DrawPanel();
        frame.add(panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static Drawing getInstance(){
        if (instance == null){
            instance = new Drawing();
        }
        return instance;
    }

    public void drawShape(Shape shape){
        String type = shape.getClass().getSimpleName();
        String colour = shape.getColor();
        double area = shape.calculateArea();

        shapes.add(shape);
        panel.repaint();

        System.out.println("Drawing a " + type + " with colour: " + colour + " and area: " + area);
    }

    private class DrawPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            for(Shape shape : shapes){
                shape.draw(g);
            }
        }
    }
}