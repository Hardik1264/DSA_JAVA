package Sorting;

import java.util.Scanner;

public class Selection_Sort {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Length:- ");
            int l=sc.nextInt();
            int [] arr=new int[l];

            for(int i=0;i<l;i++)
            {
                arr[i]=sc.nextInt();
            }
            int [] ans=Selection(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }

        static int[] Selection(int[]arr)
        {
            for (int i = 0; i < arr.length-1; i++) {
                int index=i;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]<arr[index])
                    {
                        int temp=arr[j];
                        arr[j]=arr[index];
                        arr[index]=temp;
                    }
                }
            }
            return arr;
        }
}
