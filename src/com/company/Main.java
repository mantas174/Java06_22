package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        String tekstas;

        System.out.println("Iveskite teksta kurio zodzius skaiciuosime ");
        tekstas = in.nextLine();



        System.out.println("Tekste zodziu: "+ obj.zodziuKiekis(tekstas));


    }
    public int zodziuKiekis(String tekstas){
        String [] zodziuMas = tekstas.split(" ");
        int kiek = 0;

        return zodziuMas.length;
    }
}
