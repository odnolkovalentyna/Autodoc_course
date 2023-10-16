package lessons.lesson4.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        forEachExample();
        System.out.println();
        forEachExampleWithString();
    }

    public static void forEachExampleWithString() {
        String[] names = {"Alex", "Igor", "Oleg"};
        for (String name : names) {
            System.out.println("Name of employee - " + name + " ");
        }

    }

    public static void forEachExample() {
        int[] arr = {5, 7, 8, 10};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
