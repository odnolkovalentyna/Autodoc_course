package lessons.lesson6;

public class ArrayReverse {
    public static void main(String[] args) {
        arrRev();
    }

    public static void arrRev() {
        String[] arr = {"Каждый", "охотник", "хочет", "знать", "где", "сидит", "фазан"};
        int arrLen = arr.length;

        String temp;

        for (int i = 0; i < arrLen / 2; i++) { //3 итерации
            temp = arr[arrLen - i - 1]; // index 6
            arr[arrLen - i - 1] = arr[i]; // arr[6] = arr[0]
            arr[i] = temp;

        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
