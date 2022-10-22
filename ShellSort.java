package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:- ");
        int l=sc.nextInt();
        int [] arr=new int[l];

        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int []arr)
    {
        int n= arr.length;

        for (int gap=n/2; gap>0; gap/=2)
        {
            for (int i=gap; i<n; i++)
            {
                int t=arr[i];
                int j;
                for(j=i; j>=gap && arr[j-gap]>t ; j-=gap)
                {
                    arr[j]=arr[j-gap];
                }
                arr[j]=t;
            }
        }
    }
}
