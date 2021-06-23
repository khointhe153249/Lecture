/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class UsingShelf {

    public static Scanner sc = new Scanner(System.in);

    public static void memu() {
        System.out.println("---------- FPT Academic Portal ----------");
        System.out.println("1.Add shelf.");
        System.out.println("2.Print shelf.");
        System.out.println("3.Search shelf by name.");
        System.out.println("4.Update shelf by name.");
        System.out.println("5.Sort shelf by name");
        System.out.println("6.Remove shelf.");
        System.out.println("7.Exit FAP");
        System.out.println("---------- Finish ---------");
        System.out.print("Input choice: ");
    }

    public static int amount = 0;

    public static void app(Shelf[] s) {
        while (true) {
            memu();
            int choice = Integer.parseInt(sc.nextLine());

//            int amount = 500;
            switch (choice) {
                case 1: {
                    System.out.print("Input amount shelf: ");
                    amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        System.out.println("---------- Shelf " + i + " ----------");
                        s[i] = new Shelf();
                        s[i].input();
                    }
                    break;
                }

                case 2: {
                    for (int i = 0; i < amount; i++) {
                        System.out.println("---------- Shelf " + (i + 1) + " ----------");
                        s[i].output();
                    }
                    break;
                }

                case 3: {
                    int flag = 0, pos = 0;
                    System.out.print("Input name search: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < amount; i++) {
                        if (s[i].getName().equalsIgnoreCase(name)) {
                            flag = 1;
                            pos = i + 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Exist shelf in position " + pos);
                    } else {
                        System.err.println("Shelf Not Found");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Input name search: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < amount; i++) {
                        if (s[i].getName().equalsIgnoreCase(name)) {
                            s[i].input();
                        }
                    }
                    break;
                }

                case 5: {
                    for (int i = 0; i < amount - 1; i++) {
                        for (int j = i + 1; j < amount; j++) {
                            if (s[i].getName().compareTo(s[j].getName()) > 0) {
                                Shelf tmp = s[i];
                                s[i] = s[j];
                                s[j] = tmp;
                            }
                        }
                    }
                    break;
                }

                case 6: {
                    break;
                }

                case 7: {
                    System.out.println("You are exited");
                    System.exit(0);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
//        Shelf s1 = new Shelf();
//        s1.input();
//        s1.output();
        Shelf s[] = new Shelf[500];
        app(s);
    }
}
