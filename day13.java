/*
Score: 30/30
The MyBook class is the only thing you need to put into the HackerRank editor. The rest is here for running it locally.
*/

import java.util.*;

public class day13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}

abstract class Book {

    String title;
    String author;

    Book(String t, String a) {

        title = t;
        author = a;
    }

    abstract void display();
}

class MyBook extends Book {
    private int price;

    MyBook(String title, String author, int price) {

        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}