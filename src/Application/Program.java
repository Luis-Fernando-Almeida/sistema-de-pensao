package Application;


import Entities.Rent;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] array = new Rent[n];

        for (int i=0; i<n; i++){
            sc.nextLine();
            System.out.printf("\nRent #%d\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            array[i] = new Rent(room, name, email);
        }

        Arrays.sort(array, (p1, p2) -> Integer.compare(p1.getRoom(), p2.getRoom()));

        System.out.println();
        System.out.println("Busy rooms:");
        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    sc.close();
    }
}
