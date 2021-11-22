package ioPractice;

import java.util.Scanner;

public class Program {
   static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        getCarDetail();


    }
    public static void getCarDetail(){
        System.out.println("Enter make: ");
        String make= in();
        System.out.println("Enter model: ");
        String model= in();
        System.out.println("Enter year: ");
        int year= 0;
        try {
            year= Integer.parseInt(in());

        }catch (Exception e){
            System.out.println("enter valid number");
        }
        Car c = new Car(make, model,year);

        System.out.println(c);

        scan.close();
    }
    public static String in(){

        String name= scan.nextLine();
        return name;
    }
}
