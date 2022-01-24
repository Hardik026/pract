package practice;

public class Reverse {
    public static void reverse(int arr[], int a, int b) {
        int temp;
        while (a < b) {
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
           

            
        }
      
    }

    public static void main(String[] args) {

        int array[] = { 13, 45, 1,67, 86 };
        
        System.out.println("Before reverse ");
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("After reverse");
        int start = 0, end = array.length - 1;

        reverse(array, start, end);
        for (int var : array) {
            System.out.println(var);
        }

        

    }

}
