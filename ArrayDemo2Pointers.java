
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author zoya
 */
public class ArrayDemo2Pointers {

    public static void reverseArray(int arr[]) {
        System.out.println("reversing the array");
        int startPtr = 0, endPtr = arr.length - 1;
        while (startPtr < endPtr) {
            int temp = arr[startPtr];
            arr[startPtr] = arr[endPtr];
            arr[endPtr] = temp;
            startPtr++;
            endPtr--;
        }

    }

    public static boolean sumPairExists(int arr[], int sum) {
        int startPtr = 0, endPtr = arr.length - 1;
        while (startPtr < endPtr) {
            if (arr[startPtr] + arr[endPtr] == sum) {
                System.out.println("the sum of this pair ("
                        + arr[startPtr] + ", "
                        + arr[endPtr] + ") = "
                        + sum);

                return true;
            } else if (arr[startPtr] + arr[endPtr] < sum) {
                startPtr++;
            } else {
                endPtr--;
            }

        }
        return false;
    }

    public static void shuffle(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            Random rand = new Random();
            int j = rand.nextInt(i + 1);
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arrayDemo = {1, 3, 4, 5, 7, 10};
        System.out.println("Finding the pair of a given sum = 12"
                + sumPairExists(arrayDemo, 12));
    }
}
