// Kolom dalam Array
import java.util.Scanner;

public class _1182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] arr = new double[12][12];
        String pilihan;
        double a;
        int angka;
        double sum = 0, ave = 0;

        angka = scan.nextInt();
        pilihan = scan.next();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                a = scan.nextDouble();
                arr[i][j] = a;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j][angka];
        }

        for (int j = 0; j < arr.length; j++) {
            ave = sum / 12;
        }

        if (pilihan.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (pilihan.equals("M")) {
            System.out.printf("%.1f\n", ave);
        }

        scan.close();
    }
}
