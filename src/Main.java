import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner giris = new Scanner(System.in);
     double pi = 3.14,alan;

        System.out.println("Yarı çap giriniz : ");
        int r = giris.nextInt();
        System.out.println("Merkez açısı ölçüsü giriniz : ");
        int a = giris.nextInt();

        alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı : "+alan);

        }
}