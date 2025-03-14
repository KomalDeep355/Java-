import java.util.Scanner;

public class AssignmentLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Isosceles Triangle");
            System.out.println("5. Area of Parallelogram");
            System.out.println("6. Area of Rhombus");
            System.out.println("7. Area of Equilateral Triangle");
            System.out.println("8. Perimeter of Circle");
            System.out.println("9. Perimeter of Equilateral Triangle");
            System.out.println("10. Perimeter of Parallelogram");
            System.out.println("11. Perimeter of Rectangle");
            System.out.println("12. Perimeter of Square");
            System.out.println("13. Perimeter of Rhombus");
            System.out.println("14. Volume of Cone");
            System.out.println("15. Volume of Prism");
            System.out.println("16. Volume of Cylinder");
            System.out.println("17. Volume of Sphere");
            System.out.println("18. Volume of Pyramid");
            System.out.println("19. Exit");

            int choice = input.nextInt();

            if (choice == 19) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    float r = input.nextFloat();
                    System.out.println("Area of Circle: " + (Math.PI * r * r));
                    break;
                case 2:
                    System.out.print("Enter Base and Height: ");
                    int b = input.nextInt(), h = input.nextInt();
                    System.out.println("Area of Triangle: " + (0.5 * b * h));
                    break;
                case 3:
                    System.out.print("Enter Length and Breadth: ");
                    int l = input.nextInt(), br = input.nextInt();
                    System.out.println("Area of Rectangle: " + (l * br));
                    break;
                case 4:
                    System.out.print("Enter Base and Height: ");
                    b = input.nextInt(); h = input.nextInt();
                    System.out.println("Area of Isosceles Triangle: " + (0.5 * b * h));
                    break;
                case 5:
                    System.out.print("Enter Base and Height: ");
                    b = input.nextInt(); h = input.nextInt();
                    System.out.println("Area of Parallelogram: " + (b * h));
                    break;
                case 6:
                    System.out.print("Enter Diagonals: ");
                    int d1 = input.nextInt(), d2 = input.nextInt();
                    System.out.println("Area of Rhombus: " + (0.5 * d1 * d2));
                    break;
                case 7:
                    System.out.print("Enter Side: ");
                    int s = input.nextInt();
                    System.out.println("Area of Equilateral Triangle: " + ((Math.sqrt(3) / 4) * s * s));
                    break;
                case 8:
                    System.out.print("Enter Radius: ");
                    r = input.nextFloat();
                    System.out.println("Perimeter of Circle: " + (2 * Math.PI * r));
                    break;
                case 9:
                    System.out.print("Enter Side: ");
                    s = input.nextInt();
                    System.out.println("Perimeter of Equilateral Triangle: " + (3 * s));
                    break;
                case 10:
                    System.out.print("Enter Base and Side: ");
                    b = input.nextInt(); s = input.nextInt();
                    System.out.println("Perimeter of Parallelogram: " + (2 * (b + s)));
                    break;
                case 11:
                    System.out.print("Enter Length and Breadth: ");
                    l = input.nextInt(); br = input.nextInt();
                    System.out.println("Perimeter of Rectangle: " + (2 * (l + br)));
                    break;
                case 12:
                    System.out.print("Enter Side: ");
                    s = input.nextInt();
                    System.out.println("Perimeter of Square: " + (4 * s));
                    break;
                case 13:
                    System.out.print("Enter Side: ");
                    s = input.nextInt();
                    System.out.println("Perimeter of Rhombus: " + (4 * s));
                    break;
                case 14:
                    System.out.print("Enter Radius and Height: ");
                    r = input.nextFloat(); h = input.nextInt();
                    System.out.println("Volume of Cone: " + ((1.0 / 3) * Math.PI * r * r * h));
                    break;
                case 15:
                    System.out.print("Enter Base Area and Height: ");
                    b = input.nextInt(); h = input.nextInt();
                    System.out.println("Volume of Prism: " + (b * h));
                    break;
                case 16:
                    System.out.print("Enter Radius and Height: ");
                    r = input.nextFloat(); h = input.nextInt();
                    System.out.println("Volume of Cylinder: " + (Math.PI * r * r * h));
                    break;
                case 17:
                    System.out.print("Enter Radius: ");
                    r = input.nextFloat();
                    System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * r * r * r));
                    break;
                case 18:
                    System.out.print("Enter Base Area and Height: ");
                    b = input.nextInt(); h = input.nextInt();
                    System.out.println("Volume of Pyramid: " + ((1.0 / 3) * b * h));
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}
