import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print(" Sayı : ");
        sayi = input.nextInt();
        double toplam = 0;

        for (int i=1; i<=sayi; i++){
            toplam = toplam + (1.0 / i);

        }
        System.out.print("Harmonik Serisi : " + toplam);
    }
}