public class cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        int number = 2;
        while(number<100) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
            }
            number++;
        }
    }
}
