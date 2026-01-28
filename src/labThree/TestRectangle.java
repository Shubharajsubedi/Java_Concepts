package labThree;

public class TestRectangle {

    public static void main(String[] args) {

// Set common color for all rectangles
        Rectangle.setColor("Yellow");

        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(50);

        Rectangle r2 = new Rectangle();
        r2.setWidth(15);
        r2.setHeight(5);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + r1.findArea());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + r2.findArea());
    }
}
