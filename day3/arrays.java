package day3;

public class arrays {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int arr3[] = new int[5];

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        for(int i :  arr2){
            System.out.println(i);
        }
    }
}