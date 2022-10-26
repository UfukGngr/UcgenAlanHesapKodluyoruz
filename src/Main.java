import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c,cevre,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarın uzunluğunu giriniz: ");
        a=input.nextInt();

        System.out.print("2. kenarın uzunluğunu giriniz: ");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        cevre=(a+b+c)/2;

        alan=Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));

        System.out.println("Hipotenüs uzunluğu: "+c);
        System.out.println("Üçgenin alanı: "+alan);


    }
}