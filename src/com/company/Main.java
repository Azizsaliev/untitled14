package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Honda honda = new Honda("Jazz",Color.BLUE);
   Tayota tayota = new Tayota(2020,"Camry",Color.BLACK, honda);
   Lexus lexus = new Lexus(2022,"Rx350",3.5);
        System.out.println(lexus.getInfo());
        System.out.println();
        System.out.println(tayota.getInfo());
        System.out.println();
        System.out.println(honda.getInfo());







    }




}
