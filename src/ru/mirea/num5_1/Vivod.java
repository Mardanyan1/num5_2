package ru.mirea.num5_1;

import java.util.Scanner;
import java.lang.*;
public class Vivod
{
    public static int Vivod(int n)
    {
        return n;
    }

    public static void main(String [] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i=1;i<n;i++)
        {
            Vivod(n);
            System.out.print(Vivod(i));
        }
    }
}
