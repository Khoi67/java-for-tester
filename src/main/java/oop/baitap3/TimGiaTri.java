package oop.baitap3;

public class TimGiaTri {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 0, 2, 6, 10, 8, 9};

        System.out.println("Output: " + findSecondMax(arr));
    }
    public static int findSecondMax(int[] arr) {
        if(arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
//        System.out.println(max); -2147483648
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
