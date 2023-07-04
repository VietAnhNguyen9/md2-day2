import java.util.Scanner;
public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = -10000;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0;i < 3;i++) {
                        for (int j = 0;j < 7;j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    } break;
                case 2:
                    for (int i = 0;i<5;i++) {
                        for (int j = 0;j<6;j++) {
                            if (i > j) {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    } break;
                case 3:
                    for (int i = 0;i<5;i++) {
                        for (int j = 0; j < 6; j++) {
                            if (i < j) {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }    break;


            }
        }
    }
}
