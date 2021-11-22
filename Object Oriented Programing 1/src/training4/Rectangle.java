package training4;

public class Rectangle implements Shape {
    private float hight;
    private float width;

    public Rectangle(float hight, float width) {
        this.hight = hight;
        this.width = width;
    }

    public float getHight() {
        return hight;
    }

    public float getWidth() {
        return width;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double area() {
        return hight*width;
    }
}
