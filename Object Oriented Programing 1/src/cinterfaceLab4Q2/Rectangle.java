package cinterfaceLab4Q2;

public class Rectangle implements Shape {

    float height;
    float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double area() {
        return height*width;
    }
}
