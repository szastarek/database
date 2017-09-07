package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    static public void menu(){
        int x;
        int y;

        String imie = null;
        String nazwisko = null;
        int wyplata = 0;
        int premia = 0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("1.Pracownik");
        System.out.println("2.Szef");
        x = odczyt.nextInt();

        if(x==1){
            System.out.println("       Pracownik");
            System.out.println("1.Dodaj");
            System.out.println("2.Usun");
            System.out.println("3.Aktualizuj");
            System.out.println("4.Wyswietl");
            y = odczyt.nextInt();

            if(y!=4) {
                System.out.println("Imie");
                imie = odczyt.next();
                System.out.println("Nazwisko");
                nazwisko = odczyt.next();
                System.out.println("Wyplata");
                wyplata = odczyt.nextInt();
            }
            switch (y){
                case 1:{
                    zlecenie nowy = new zlecenie(imie,nazwisko,wyplata);
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.addQuery());
                    System.out.println("ADDED");
                }break;
                case 2:{
                    zlecenie nowy = new zlecenie(imie,nazwisko,wyplata);
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.removeQuery());
                    System.out.println("REMOVED");
                }break;
                case 3:{
                    zlecenie nowy = new zlecenie(imie,nazwisko,wyplata);
                    System.out.println("Imie");
                    nowy.newImie = odczyt.next();
                    System.out.println("Nazwisko");
                    nowy.newNazwisko = odczyt.next();
                    System.out.println("Wyplata");
                    nowy.newWyplata = odczyt.nextInt();
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.updateQuery());
                }break;
                case 4:{
                    getConnection polaczenie = new getConnection();
                    polaczenie.wyswietl(zlecenie.wyswietlzlecenie());


                }break;
                default: System.out.println("Wrong input");
            }
        }


        if(x==2){
            System.out.println("       SZEF");
            System.out.println("1.Dodaj");
            System.out.println("2.Usun");
            System.out.println("3.Aktualizuj");
            System.out.println("4.Wyswietl");
            y = odczyt.nextInt();

            if(y!=4) {
                System.out.println("Imie");
                imie = odczyt.next();
                System.out.println("Nazwisko");
                nazwisko = odczyt.next();
                System.out.println("Wyplata");
                wyplata = odczyt.nextInt();
                System.out.println("Premia");
                premia = odczyt.nextInt();
            }
            switch (y){
                case 1:{
                    szef nowy = new szef(imie,nazwisko,wyplata,premia);
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.addQuery());
                    System.out.println("ADDED");
                }break;
                case 2:{
                    szef nowy = new szef(imie,nazwisko,wyplata,premia);
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.removeQuery());
                    System.out.println("REMOVED");
                }break;
                case 3:{
                    szef nowy = new szef(imie,nazwisko,wyplata,premia);
                    System.out.println("Imie");
                    nowy.newImie = odczyt.next();
                    System.out.println("Nazwisko");
                    nowy.newNazwisko = odczyt.next();
                    System.out.println("Wyplata");
                    nowy.newWyplata = odczyt.nextInt();
                    System.out.println("Premia");
                    nowy.newPremia = odczyt.nextInt();
                    getConnection polaczenie = new getConnection();
                    polaczenie.zapytanie(nowy.updateQuery());
                }break;
                case 4:{
                    getConnection polaczenie = new getConnection();
                    polaczenie.wyswietl(szef.wyswietlSzef());


                }break;
                default: System.out.println("Wrong input");
            }
        }



    }

}
