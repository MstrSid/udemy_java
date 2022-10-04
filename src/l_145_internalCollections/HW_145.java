package l_145_internalCollections;

import java.util.ArrayList;

public class HW_145 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> concats = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add((int) ((Math.random() * (100 - 1)) + 1));
            names.add(String.format("Name%d", i));
        }

        for (int i = 0; i < numbers.size(); i++) {
            concats.add(String.format("%d - %s", numbers.get(i), names.get(i)));
        }

        for (String item : names) {
            System.out.println(item);
        }
        System.out.printf("Size: %d\n",concats.size());
    }
}
