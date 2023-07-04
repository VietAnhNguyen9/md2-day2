import java.util.Scanner;
public class InterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        int so_tien_gui = scanner.nextInt();
        System.out.println("Nhập tỷ lệ lãi suất: ");
        float ty_le_lai_suat = scanner.nextFloat();
        System.out.println("Nhập số tháng: ");
        int so_thang = scanner.nextInt();
        double so_tien_lai = 0;
        for (int i =0;i < so_thang;i++) {
             so_tien_lai += so_tien_gui * (ty_le_lai_suat/100)/12 * so_thang;
        }
        System.out.println(so_tien_lai);

    }
}
