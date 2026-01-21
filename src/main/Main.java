package main;

import domain.Proizvod;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Koliko proizvoda zelite da unesete?");;
    int brojProizvoda = scanner.nextInt();

    ArrayList<Proizvod> listaProizvoda = new ArrayList<>();

    for(int i=0;i<brojProizvoda;i++) {
        System.out.println("Unesite ime proizvoda: ");
        String ime = scanner.next();2
        System.out.println("Unesite cenu proizvoda: ");
        float cena = scanner.nextFloat();

        Proizvod proizvod = new Proizvod(ime, cena);
        listaProizvoda.add(proizvod);
    }

    for(Proizvod p:listaProizvoda){
            System.out.println("Ime proizvoda je: "+ p.getIme() + "; i njegova cena je:"+ p.getCena() +".");
        }
}
}




