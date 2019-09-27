import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Circle Test ");
            System.out.println("2. Cylinder Test ");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    CylinderTest();
                    break;
                case 2:
                    CircleTest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("just input 0 to 2.");
                    break;
            }
        }
    }

    public static void CircleTest(){
        Circle c = new Circle();
        System.out.println(c);

        c = new Circle(3.5,"white");
        System.out.println(c);
    }

    public static void CylinderTest(){
        Cylinder cy = new Cylinder();
        System.out.println(cy);

        cy = new Cylinder(3.5,"white",5.0);
        System.out.println(cy);
    }
}
