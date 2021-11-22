package cinterfaceLab4Q2;

public class
TesterClass {


    public static void main(String[] args) {
        Circle s= new Circle(2);
        Rectangle r= new Rectangle(2,4);
    showArea(s);
    showArea(r);
    }
  public static void showArea(Shape s){
        double area=s.area();
      System.out.println("The area of the shape is " +area);
  }
}
