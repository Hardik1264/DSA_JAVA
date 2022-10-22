package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:- ");
        int l=sc.nextInt();
        int [] arr=new int[l];

        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }

        RadixS(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void CountingS(int []arr , int place)
    {
        int n=arr.length;
        int[] ans =new int[n+1];
        int[] count =new int[10];

        for (int j : arr) count[(j/place)%10]++;

        for(int i = 1; i<10; i++)
            count[i] += count[i-1]; //find cumulative frequency

        /* This loop will find the index of each element of the original array in
            count array, and place the elements in ans array*/
        for (int i=n-1;i>=0;i--)
        {
            ans[count[(arr[i] / place) % 10] - 1]=arr[i];
            count[(arr[i] / place)%10]--;
        }
        for(int i = 0; i<n; i++) {
            arr[i] = ans[i]; //store the sorted elements into main array
        }
    }

    static void RadixS(int[] a) {

        // get maximum element from array
        int max = getMax(a);

        // Apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10)
            CountingS(a,  place);
    }

    static int getMax(int[] a) {
        int max = a[0];
        for(int i = 1; i<a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max; //maximum element from the array
    }
}
