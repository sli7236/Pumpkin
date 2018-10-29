package com.company;

public class Main {

    public static void main(String[] args) {
        Pumpkin pumpkin1 = new Pumpkin("|","O","U");
        pumpkin1.makePumpkin();

        System.out.println();

        Pumpkin pumpkin2 = new Pumpkin("-","U","W");
        pumpkin2.makePumpkin();

        System.out.println();

        Pumpkin pumpkin3 = new Pumpkin("+","X","O");
        pumpkin3.makePumpkin();
    }
}
