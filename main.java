package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class Main {


    public static void main(String[] args)throws IOException {
        // write your code here


        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);


        InputStreamReader r2= new InputStreamReader(System.in);
        BufferedReader br2= new BufferedReader(r2);


        InputStreamReader r3= new InputStreamReader(System.in);
        BufferedReader br3= new BufferedReader(r3);


        InputStreamReader r4= new InputStreamReader(System.in);
        BufferedReader br4= new BufferedReader(r4);


        InputStreamReader r5= new InputStreamReader(System.in);
        BufferedReader br5= new BufferedReader(r5);


        InputStreamReader r6= new InputStreamReader(System.in);
        BufferedReader br6= new BufferedReader(r5);




        String uii="";
        String en="";
        String shift="";
        String ui="";
        String yn="";
        String sh="";
        String e="";



        while (!uii.equalsIgnoreCase("quit")){


            System.out.println("Encrypt\nDecrypt\nQuit");


            uii=br6.readLine();
            switch(uii) {
                case ("Encrypt"):
                    System.out.println(" ");
                    System.out.println("Input data: (no special characters or numbers)");
                    en = br.readLine();
                    en = en.toUpperCase();
                    System.out.println("  ");

                    System.out.println("Shift by?");
                    shift = br2.readLine();
                    Integer i = Integer.valueOf(shift);


                    System.out.println(" ");


                    for (int index = 0; index < en.length(); index++) { //LOOP through message and then change the lettering
                        int f = Character.codePointAt(en, index);


                        if (i > 26 && f != 32) {
                            int t = i % 26;
                            int f2 = f + t;
                            if (f2 >= 90) {
                                f2 -= 26;
                            }
                            char fc = (char) (f2);
                            e += fc;


                        } else if (f == 32) {
                            e += " ";


                        } else {
                            int f3 = f + i;
                            if (f3 >= 90) {
                                f3 -= 26;
                            }
                            char fc2 = (char) (f3);
                            e += fc2;
                        }
                    }
                    System.out.println("\nOriginal Message: " + en);
                    System.out.println("Encrypted Message is: " + e);
                    System.out.println(" ");
                    break;


                case ("Decrypt"):

                    System.out.println("Do you want to decrypt previous message? (yes/no)\n");
                    yn = br4.readLine();

                        switch (yn) {
                            case "yes":
                                if (e.isEmpty()) {
                                    System.out.println("\nSorry this is unavailable.\n");
                                }else {
                                    System.out.println();
                                    System.out.println("\nDo you know the shift? (yes/no)");
                                    yn = br4.readLine();
                                    System.out.println(" ");


                                    switch (yn) {
                                        case "yes":
                                            System.out.println(" ");
                                            System.out.println("Please enter shift");
                                            sh = br5.readLine();
                                            int Ushift = Integer.valueOf(sh);
                                            System.out.println(" ");
                                            System.out.println("Decrypted Message: ");

                                            for (int ic = 0; ic < e.length(); ic++) {
                                                int d = Character.codePointAt(e, ic);


                                                if (Ushift > 26 && d != 32) {//have to do except 32 do this
                                                    int tt = Ushift % 26;
                                                    if ((d - tt) < 65) {
                                                        int ds = (d - tt) + 26;
                                                        char dc = (char) (ds);
                                                        System.out.print(dc);
                                                    } else {
                                                        int ds = d - tt;
                                                        char dc = (char) (ds);
                                                        System.out.print(dc);
                                                    }


                                                } else if (d == 32) {
                                                    System.out.print(" ");


                                                } else {
                                                    int ds = d - Ushift;
                                                    if (ds < 65) {
                                                        int ds2 = ds + 26;
                                                        char dc = (char) (ds2);
                                                        System.out.print(dc);


                                                    } else {
                                                        char dc = (char) (ds);
                                                        System.out.print(dc);
                                                    }
                                                }
                                            }
                                            System.out.println("  ");break;


                                        case "no": //NEED TO FIND WAY TO RESTRICT TO ONLY ALPHABETS
                                            System.out.println("\nOriginal message: " + en);
                                            System.out.println("All possible message: ");
                                            for (int dshift = 0; dshift < 26; dshift++) { //increment the shift


                                                String dd = "";
                                                for (int l = 0; l < e.length(); l++) { //increment through the letters
                                                    int le = Character.codePointAt(e, l);


                                                    int ds = le - dshift;
                                                    if (ds <= 64 && le != 32) {
                                                        int ds2 = ds + 26;
                                                        char dc = (char) (ds2);
                                                        dd += dc;


                                                    } else if (le == 32) {
                                                        dd += " ";


                                                    } else {
                                                        char dc = (char) (ds);
                                                        dd += dc;
                                                    }
                                                }
                                                System.out.println(dd);
                                            }
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("\nSorry, this is not an option.");
                                            break;
                                    }
                                    System.out.println();
                                }break;

                            case "no":
                                System.out.println("\nWhat message do you want to decrypt? (no special characters or numbers");
                                ui = br3.readLine();
                                String UI = ui.toUpperCase();


                                System.out.println("\nDo you know the shift? (yes/no)");
                                yn = br4.readLine();
                                System.out.println(" ");


                                switch (yn) {
                                    case "yes":
                                        System.out.println("\nPlease enter shift");
                                        sh = br5.readLine();
                                        int Ushift = Integer.valueOf(sh);
                                        System.out.println("\nDecrypted Message: ");


                                        for (int ic = 0; ic < UI.length(); ic++) {
                                            int d = Character.codePointAt(UI, ic);

                                            if (Ushift > 26 && d != 32) {//have to do except 32 do this
                                                int tt = Ushift % 26;
                                                if ((d - tt) < 65) {
                                                    int ds = (d - tt) + 26;
                                                    char dc = (char) (ds);
                                                    System.out.print(dc);
                                                } else {
                                                    int ds = d - tt;
                                                    char dc = (char) (ds);
                                                    System.out.print(dc);
                                                }


                                            } else if (d == 32) {
                                                System.out.print(" ");


                                            } else {
                                                int ds = d - Ushift;
                                                if (ds < 65) {
                                                    int ds2 = ds + 26;
                                                    char dc = (char) (ds2);
                                                    System.out.print(dc);


                                                } else {
                                                    char dc = (char) (ds);
                                                    System.out.print(dc);
                                                }
                                            }
                                        }
                                        System.out.println();
                                        break;


                                    case "no": //NEED TO FIND WAY TO RESTRICT TO ONLY ALPHABETS
                                        System.out.println("\nAll possible message: ");
                                        for (int dshift = 0; dshift < 26; dshift++) { //increment the shift


                                            String dd = "";
                                            for (int l = 0; l < UI.length(); l++) { //increment through the letters
                                                int le = Character.codePointAt(UI, l);


                                                int ds = le - dshift;
                                                if (ds <= 64 && le != 32) {
                                                    int ds2 = ds + 26;
                                                    char dc = (char) (ds2);
                                                    dd += dc;


                                                } else if (le == 32) {
                                                    dd += " ";


                                                } else {
                                                    char dc = (char) (ds);
                                                    dd += dc;
                                                }
                                            }
                                            System.out.println(dd);
                                        }
                                        System.out.println(" ");
                                        break;

                                    default:
                                        System.out.println("\nSorry, this is not an option.");
                                        break;
                                }
                                break;

                            default:
                                System.out.println("\nSorry, this is not an option.");
                                break;
                        } break;


                    default:
                        if (uii.equalsIgnoreCase("quit")){
                            System.out.print("Goodbye");
                        }else{
                            System.out.println("\nSorry, this is not an option.");
                        }
                    break;

                    }


        }
    }}






