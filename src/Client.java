public class Client {
    public static void main(String[] args) {
        // Create some shapes with specified color
        Shape square = new Square("#FF0000", 5.0);
        Shape circle = new Circle("#0000FF", 3.0);
        Shape circle2 = new Circle("#00FF00", 3.0);


        // Uncomment the following after implementing your drawing class
        // // Retrieve the stance of drawing
        Drawing drawing = Drawing.getInstance();

        // // Draw shapes on the instances
        drawing.drawShape(square);
        drawing.drawShape(circle);
        drawing.drawShape(circle2);
    }
}