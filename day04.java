// Score: 30/30

import java.util.Scanner;

public class day04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number of people: ");
        int numPeople = input.nextInt();
        int[] ages = new int[numPeople];
        for (int i = 1; i <= numPeople; i++) {
            System.out.print("Age of person #" + i + ": ");
            ages[(i - 1)] = input.nextInt();
        }

        Person[] people = new Person[numPeople];

        for (int i = 0; i < ages.length; i++){
            people[i] = new Person(ages[i]);
            people[i].amIOld();
            for(int j = 0; j < 3; j++) {
                people[i].yearPasses();
            }
            people[i].amIOld();
            System.out.println();
        }

        input.close();
    }

    static class Person {

        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge >= 0) {
                this.age = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (this.age < 13) {
                System.out.println("You are young.");
            } else {
                if (this.age >= 13 && this.age < 18) {
                    System.out.println("You are a teenager.");
                } else {
                    System.out.println("You are old.");
                }
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            this.age += 1;
        }

    }
}