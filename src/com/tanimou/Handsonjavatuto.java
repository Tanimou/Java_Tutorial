package com.tanimou;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Handsonjavatuto {

    public static void main(String[] args) {
        double number = 100.052;

        Date date = new Date();
        LocalDate localdate = LocalDate.now();
        LocalDateTime yaya = LocalDateTime.now();

        int[] numbers = { 1, 2, 3, 4 };

        Arrays.stream(numbers).forEach(System.out::println);
        String brand = "tanimou";
        System.out.println("brand: " + brand.toUpperCase());
        System.out.println("Hello, World!");

        // * creation of object based on template class(instanciation)

        Person alex = new Person("alex", 16, 18.5);
        
       // System.out.println("before changing alex");
        System.out.println("alex's name: " + alex.name);
        System.out.println("alex's age: " + alex.age);
        System.out.println("alex's taille: " + alex.taille);
      /*  System.out.println("after changing alex");
        System.out.println("alex: " + alex.name);
        System.out.println(" maryam: " + maryam.name);
*/
        Lens Lens_1 = new Lens(brand, "85CM", true, "Affane", 16, 889785);
        Lens Lens_2 = new Lens(brand, "79CM", false, brand, 18, 5842);
        Lens Lens_3 = new Lens(brand, "50CM", true, brand, 20, number);
        Person maryam = Lens_1;
        Lens_2= (Lens) maryam;
        System.out.println(" maryam's name: " + maryam.name);
        System.out.println("maryam's age: " + maryam.age);
        System.out.println("maryam's taille: " + maryam.taille);
        System.out.println("");

        System.out.println("Lens 1:");
        System.out.println(Lens_1.brand);
        System.out.println(Lens_1.age);
        System.out.println(Lens_1.focalLength);
        System.out.println(Lens_1.isPrime);
        System.out.println("");

        System.out.println("Lens 2:");
        System.out.println(Lens_2.brand);
        System.out.println(Lens_2.age);
        System.out.println(Lens_2.focalLength);
        System.out.println(Lens_2.isPrime);
        System.out.println("");

        System.out.println("Lens 3:");
        System.out.println(Lens_3.brand);
        System.out.println(Lens_3.age);
        System.out.println(Lens_3.focalLength);
        System.out.println(Lens_3.isPrime);

        // *switch case

        String gender = "Female";
        switch (gender) {

            case "Female":
                System.out.println("I'm a male");
                break;
            case "EXEL":
                System.out.println("I'm exel!");
                break;
            case "prefer not to say":
                System.out.println("I prefer not to say!");
                break;
            default:
                System.out.println("Unknown gender");

        }
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("what is your name?"); 
         String name = scanner.nextLine();
         System.out.println("How old are you?"); 
         int age = scanner.nextInt();
         System.out.println("Hello " + name); 
         System.out.println("here is your age " + age); 
         int year = LocalDate.now().minusYears(age).getYear();
         System.out.println("you were born in " + year);
         
         int count = 0;
        
          char tableau[] = { 'A', 'B', 'C', 'D', 'D', 'D', 'D' };
          
          System.out.println("tape the letter you want to see the number of occurence:"
          ); // * read a char
           char searchLetter = scanner.next().charAt(0);
            count =  count0ccurence(tableau, searchLetter); 
          
            System.out.println("We have found " +
          count + " occurences of " + searchLetter);
         
    }

    // * creation of methods (functions())
    public static int count0ccurence(char letters[], char letter) {

        int count = 0;
        for (char i : letters) {
            if (i == letter) {
                count++;
            }

        }
        String message = count == 0 ? "Sorry there is no occurence" : "Hooray, there is some occurence";
        System.out.println(message);

        return count;
    }

    // * creation of class

    static class Person {
        String name;
        int age;
        double taille;
        // * constructor of class Person

        Person(String name, int age, double taille) {
            this.name = name;
            this.age = age;
            this.taille = taille;
        }
    }
    // *Heritage class

    static class Lens extends Person
     {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean string, String name, int age, double taille) {
            super(name, age, taille);
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = string;
        }
    }

}
