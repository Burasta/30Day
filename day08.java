// Score: 30/30

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entries = input.nextInt();

        Map<String, String> phoneBook = new HashMap<>();

        for(int i = 0; i < entries; i++) {
            phoneBook.put(input.next(), input.next());
        }

        ArrayList searches = new ArrayList();

        while(input.hasNext()) {
            String name = input.next();
            if(name.equals("0")) {
                break;
            }
            searches.add(name);
        }

        input.close();

        for (Object search : searches) {
            String name = (String) search;
            if (phoneBook.get(name) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(name + "=" + phoneBook.get(name));
            }
        }
    }
}