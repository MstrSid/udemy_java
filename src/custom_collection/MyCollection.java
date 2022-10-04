package custom_collection;

public class MyCollection {
    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index > size || index < 0 || array[index] == null) {
            return "Invalid index";
        } else return array[index];
    }

    public void add(String elem) {
        if (size == array.length) {
            increase();
        }
        array[size] = elem;
        size++;
    }

    public void remove(int index) {
        if (index > size || index < 0 || array[index] == null) {
            System.out.println("Invalid index");
        } else {
            size--;
            for (int i = index; i <= size; i++) {
                if (i != size) {
                    array[i] = array[i + 1];
                } else {
                    array[i] = null;
                }

            }
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    private void increase() {
        String[] temp = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
