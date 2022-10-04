package custom_collection;

public class Main {
    public static void main(String[] args) {
//        String[] employees = {"Nick", "Igor", "Volha", "Vasiliy", "Maks"};
//
//        String[] second = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++) {
//            second[i] = employees[i];
//        }
//        second[second.length-1] = "Bob";
//        employees = second;
//        employees[1] = null;
//        String[] third = new String[employees.length-1];
//        for (int i=0, j=0; i<employees.length; i++) {
//           if(employees[i] != null){
//               third[j] = employees[i];
//               j++;
//           }
//        }
//
//        employees = third;
//
//        for (String name : employees) {
//            System.out.println(name);
//        }

        MyCollection sArray = new MyCollection();
        sArray.add("Mike");
        sArray.add("Bob");
        sArray.add("Anna");
        System.out.println(sArray.getSize());
        for (int i = 0; i < sArray.getSize(); i++) {
            System.out.println(sArray.get(i));
        }
        sArray.remove("Mike");
        sArray.remove("Anna");
        System.out.println(sArray.getSize());
        for (int i = 0; i < sArray.getSize(); i++) {
            System.out.println(sArray.get(i));
        }
        System.out.println(sArray.get(1));

    }
}
