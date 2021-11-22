package cinterfaceLab4Q2;

public class Circle implements Shape{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(radius ,2)*3.41;
    }
}
