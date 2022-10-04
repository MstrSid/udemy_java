package l_145_internalCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println(sum);

        TreeSet<String> newNames = new TreeSet<>();
        newNames.add("Alan");
        newNames.add("Alan");
        newNames.add("Mike");
        newNames.add("Ann");

        for (String name : newNames) {
            System.out.println(name);
        }
    }
}
