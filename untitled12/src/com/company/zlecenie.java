package com.company;

import java.util.Scanner;

public class zlecenie {
    String imie;
    String nazwisko;
    int wyplata;

    String newImie;
    String newNazwisko;
    int newWyplata;


    public zlecenie(){
        imie = "";
        nazwisko = "";
        wyplata = 0;
    }
    public zlecenie(String imie, String nazwisko, int wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }




    public String addQuery(){
        return "INSERT INTO `zlecenie` (`Imie`, `Nazwisko`, `Wyplata`) VALUES ('" +imie + "', '" +nazwisko + "', '" +wyplata + "')";
    }

    public String removeQuery(){
        return "DELETE FROM `zlecenie` WHERE Imie = '"+imie+"' AND Nazwisko = '"+nazwisko+"'";
    }

    public String updateQuery(){
        return "UPDATE `zlecenie` SET Imie='"+newImie+"', Nazwisko='"+newNazwisko+"',Wyplata='"+newWyplata+"' WHERE Imie = '"+imie+"' AND Nazwisko = '"+nazwisko+"' AND Wyplata = '"+wyplata+"'";
    }

    public static String wyswietlzlecenie(){
        return "SELECT * FROM `zlecenie` WHERE 1";
    }
}


