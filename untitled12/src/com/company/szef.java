package com.company;

public class szef extends zlecenie {

    int premia;
    int newPremia;

    public szef(){
        this.imie = "";
        this.nazwisko = "";
        this.wyplata = 0;
    }

    public szef(String imie, String nazwisko, int wyplata, int premia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
        this.premia = premia;
    }


    public String addQuery(){
        return "INSERT INTO `szef` (`Imie`, `Nazwisko`, `Wyplata` ,`Premia`) VALUES ('" +imie + "', '" +nazwisko + "', '" +wyplata + "', '" +premia + "')";
    }

    public String removeQuery(){
        return "DELETE FROM `szef` WHERE Imie = '"+imie+"' AND Nazwisko = '"+nazwisko+"'";
    }

    public String updateQuery(){
        return "UPDATE `szef` SET Imie='"+newImie+"', Nazwisko='"+newNazwisko+"',Wyplata='"+newWyplata+"',Premia='"+newPremia+"' WHERE Imie = '"+imie+"' AND Nazwisko = '"+nazwisko+"' AND Wyplata = '"+wyplata+"'AND Premia = '"+premia+"'";
    }

    public static String wyswietlSzef(){
        return "SELECT * FROM `szef` WHERE 1";
    }

}
