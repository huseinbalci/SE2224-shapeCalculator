import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape Calculator");
        System.out.println("1.Calculate a shape");
        System.out.println("2.Exit");


        Shape shp = null;
        String dim;
        String typ;
        int radius;
        int width;
        int height;
        int edge;

        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Choose dimension of shape (2D/3D): ");
                dim = scanner.nextLine();
                switch (dim.toLowerCase()) {
                    case "2d":
                        System.out.print("Choose type of shape (Circle/Rectangle): ");
                        typ = scanner.nextLine();
                        switch (typ.toLowerCase()) {
                            case "circle":
                                System.out.print("Enter radius of the circle: ");
                                radius = scanner.nextInt();
                                scanner.nextLine();
                                shp = new Circle(radius);
                                break;
                            case "rectangle":
                                System.out.print("Enter width of the rectangle: ");
                                width = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter height of the rectangle: ");
                                height = scanner.nextInt();
                                scanner.nextLine();
                                shp = new Rectangle(width, height);
                                break;
                            default:
                                System.out.println("Invalid type of shape. Please try again.");
                                continue;
                        }
                        break;
                    case "3d":
                        System.out.print("Choose type of shape (Cube/Sphere): ");
                        typ = scanner.nextLine();
                        switch (typ.toLowerCase()) {
                            case "cube":
                                System.out.print("Enter edge of the cube: ");
                                edge = scanner.nextInt();
                                scanner.nextLine();
                                shp = new Cube(edge);
                                break;
                            case "sphere":
                                System.out.print("Enter radius of the sphere: ");
                                radius = scanner.nextInt();
                                scanner.nextLine();
                                shp = new Sphere(radius);
                                break;
                            default:
                                System.out.println("Invalid type of shape. Please try again.");
                                continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid dimension of shape. Please try again.");
                        continue;
                }
                break;
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        }
        if (shp != null) {
            System.out.println("Perimeter: " + shp.calculatePerimeter());
            System.out.println("Area: " + shp.calculateArea());
            System.out.println("Volume: " + shp.calculateVolume());
        }
        scanner.close();
    }
}
