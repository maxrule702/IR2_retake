package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int pos = 0;
    int curent = 0;
    boolean found = false;
        String [] names = {"Ben","Thor","Zoe","Kate"};
        System.out.println("which player are you looking for?");
        Scanner input = new Scanner(System.in);
        String PlayerName = input.next();
       int  max = names.length;
        for (int i = 0; i < max ; i++) {
            pos++;
            if (PlayerName.equals(names[pos])){
            System.out.println("yes they have a top score");
            curent ++;
            found = true;
            break;
            }
            if(pos ==3){
                break;
            }
        }
        if (curent == 0) {
            System.out.println("they do not have a top score");
            found = false;
        }

    }
}
