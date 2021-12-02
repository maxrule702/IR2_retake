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


//package com.company;
//import java.util.Scanner;
//import java.util.ArrayList;
//public class Main {
//
//    public static void main(String[] args) {
//        int remainder = 0;
//
//        ArrayList<Integer> binary = new ArrayList<Integer>();
//        System.out.println("please enter your number");
//        Scanner input = new Scanner(System.in);
//        int userNumber = input.nextInt();
//        while (userNumber != 0 ){
//            remainder = userNumber % 2;
//            userNumber = userNumber / 2;
//            binary.add(remainder);
//            System.out.print(userNumber+ " ");
//
//        }
//        int firstPostion = binary.size();
//        System.out.println(firstPostion);
//        int pos = binary.size()-1 ;
//
//        for (int i = 0; i < binary.size();) {
//            System.out.println(binary.get(pos));
//            pos--;
//            if (pos == -1){
//                break;
//                }
//            }
//        }
//    }


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        leetsConverter();}

        public static void leetsConverter() {
            Scanner input = new Scanner(System.in);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                Scanner console = new Scanner(line);

                while (console.hasNext()) {
                    String word = console.next();
                    word = word.toLowerCase();
                    if (word.contains("a")) {
                        word = word.replace("a", "4");
                    }
                    if (word.contains("b")) {
                        word = word.replace("b", "6");
                    }
                    if (word.contains("e")) {
                        word = word.replace("e", "3");
                    }
                    if (word.contains("i")) {
                        word = word.replace("i", "1");
                    }
                    if (word.contains("l")) {
                        word = word.replace("l", "1");
                    }
                    if (word.contains("m")) {
                        word = word.replace("m", "(v)");
                    }
                    if (word.contains("n")) {
                        word = word.replace("n", "\\");
                    }
                    if (word.contains("o")) {
                        word = word.replace("o", "0");
                    }
                    if (word.contains("s")) {
                        word = word.replace("s", "5");
                    }
                    if (word.contains("t")) {
                        word = word.replace("t", "7");
                    }
                    if (word.contains("v")) {
                        word = word.replace("v", "\\/");
                    }
                    if (word.contains("w")) {
                        word = word.replace("w", "`//");
                    }
                    if (word.charAt(word.length() - 1) == 's') {
                        word = word.substring(0, word.length() - 1) + "Z";
                    }
                    System.out.println(( word +  " "));
                }
                }

            }


        }



