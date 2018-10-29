package com.company;

public class Pumpkin {
    private String fill;
    private String eyes;
    private String mouth;
    public Pumpkin (String fill, String eyes, String mouth)
    {
        this.fill = fill;
        this.eyes = eyes;
        this.mouth = mouth;
    }

    public void makePumpkin()
    {
        System.out.print(" ");
        for (int i = 0; i < 13; i++)
        {
            System.out.print("_");
        }
        System.out.println();
        System.out.print("/");
        for (int i = 0; i < 13; i++)
        {
            System.out.print(fill);
        }
        System.out.print("\\");
        System.out.println();
        for (int i = 0; i < 4; i++)
        {
            System.out.print(fill);
        }
        System.out.print(eyes);
        for (int i = 0; i < 5; i++)
        {
            System.out.print(fill);
        }
        System.out.print(eyes);
        for (int i = 0; i < 4; i++)
        {
            System.out.print(fill);
        }
        System.out.println();
        for (int i = 0; i < 7; i++)
        {
            System.out.print(fill);
        }
        System.out.print(mouth);
        for (int i = 0; i < 7; i++)
        {
            System.out.print(fill);
        }
        System.out.println();
        for (int i = 0; i < 15; i++)
        {
            System.out.print(fill);
        }
        System.out.println();
        System.out.print("\\");
        for (int i = 0; i < 13; i++)
        {
            System.out.print("_");
        }
        System.out.print("/");
    }
}
