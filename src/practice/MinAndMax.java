package practice;

public class MinAndMax {
    public static int findMax(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            
            if (x > max) {
                max = x;
            }
           
        }
        return max;

    }

    public static int findMin(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < min)
                min = x;

        }
        return min;

    }

    public static void main(String[] args) {
        int array[] = { 2300, 63, 56, 42, 12 ,-90000};
        int min = findMin(array);
        int max = findMax(array);
        System.out.println("min :" + min+  '\n'+ "max::" + max);

    }

}
