import java.util.Scanner;

public class _1189 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] arr = new double[12][12];
        String pilihan;
        double a;
        int angka = 0, angka2 = 1;
        double sum = 0, ave = 0;

        pilihan = scan.next();

        for (int i=0;i<arr.length;i++){
            for (int j=0; j<arr.length;j++){
                a = scan.nextDouble();
                arr[i][j] = a;
            }
        }

        for (int i=1; i<arr.length;i++){

            for (int j=0;j<angka2;j++){
                //System.out.println(i + " " + j);
                sum = sum + arr[i][j];
            }

            if (i<5){
                angka2++;
            }else if (i > 5){
                angka2--;
            }
        }

        ave = sum/30;


        if (pilihan.equals("S")){
            System.out.printf("%.1f\n",sum);
        }else if (pilihan.equals("M")){
            System.out.printf("%.1f\n",ave);
        }
    }
}
