package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write input
        int hasmot,opposite,diff;
        Scanner  input = new Scanner (System.in);
        hasmot=input.nextInt();
        opposite=input.nextInt();
        diff=hasmot-opposite;
        if(diff>0)
        {

            // abcd
            System.out.print(diff);
        }
        else{
            System.out.println(diff*-1);
        }


     }
}
