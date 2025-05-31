package mains;
import models.*;
import java.util.Scanner;
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP\t: Mohammad Iqbal Bagas Permana");
        System.out.println("NIM\t: 245150701111024");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double radiusBesar = sc.nextDouble();
        System.out.print("Isikan radius   : ");
        double radiusKecil = sc.nextDouble();

        Torus torus = new Torus(radiusBesar, radiusKecil);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radiusSphere = sc.nextDouble();

        Sphere sphere = new Sphere(radiusSphere);
        sphere.printInfo();

        System.out.println("=============================================");

        sc.close();
       
    }
}
