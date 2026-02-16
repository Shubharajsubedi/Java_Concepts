package LabSeven;

interface GeometricObject {
    double getperimeter();
    double getArea();
}

class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getperimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}

interface Resizable {
    void resize(int percent);
}


class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius += radius * percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle with radius = " + radius;
    }
}