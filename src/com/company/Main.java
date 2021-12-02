//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int current = 0;
//        int endCheck = 0;
//        String[] names = {"Ben", "Thor", "Zoe", "Kate"};
//        System.out.println("which player are you looking for?");
//        Scanner input = new Scanner(System.in);
//        String PlayerName = input.next();
//        int max = names.length;
//        for (int i = 0; i < max; i++) {
//            current++;
//            if (current == 4) {
//                endCheck++;
//                break;
//            }
//            if (PlayerName.equals(names[current])) {
//
//                boolean found = true;
//                if (found == true) {
//                    System.out.println("Yes, they have a top score");
//                }
//                break;
//            }
//        }
//        if (endCheck == 1) {
//            System.out.println("No, they do not have a top score");
//        }
//    }
//        }
//
//
//
//
package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int remainder = 0;

        ArrayList<Integer> binary = new ArrayList<Integer>();
        System.out.println("please enter your number");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        while (userNumber != 0 ){
            remainder = userNumber % 2;
            userNumber = userNumber / 2;
            binary.add(remainder);
            System.out.print(userNumber+ " ");

        }
        int firstPostion = binary.size();
        System.out.println(firstPostion);
        int pos = binary.size()-1 ;

        for (int i = 0; i < binary.size();) {
            System.out.println(binary.get(pos));
            pos--;
            if (pos == -1){
                break;
                }
            }
        }
    }