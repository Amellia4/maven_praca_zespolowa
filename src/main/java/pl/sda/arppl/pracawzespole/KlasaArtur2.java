package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class KlasaArtur2 {
    public static void main(String[] args) {
        System.out.println("Jak masz na Imię? ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        System.out.println("Jak masz na drugie Imię? ");
        String drugieImie = scanner.next();

        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową ");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę zmiennoprzecinkową ");
        double drugaLiczba = scanner.nextDouble();

        double suma = pierwszaLiczba+drugaLiczba;
        double roznica = pierwszaLiczba-drugaLiczba   ;
        System.out.println("Hej" +imie+" "+drugieImie+"Suma tych liczb wynosi: " +suma+", a rożnica "+roznica);

    }
}
