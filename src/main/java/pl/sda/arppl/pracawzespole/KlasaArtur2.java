package pl.sda.arppl;

import java.util.Scanner;//dopisane specjalnie by miec zmiany

public class KlasaArtur2 {
    public static void main(String[] args) {
        System.out.println("Jak masz na Imię? ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        System.out.println("Jak się nazywasz? ");
        String nazwisko = scanner.next();

        System.out.println("Fajnie.. fajnie... a .... jaki masz numer buta? ");
        int but = scanner.nextInt();
        System.out.println("Oj," +imie+" "+nazwisko+ " ale masz nogę! Twój rozmiar to "+but+"?!");

    }
}
