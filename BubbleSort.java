import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr ={1,3,6,2,0,5};
        Bubble(arr,arr.length-1,0);

        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr, int r, int c)
    {
        if (r==0) return;

        if (r>c)
        {
            if (arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
                Bubble(arr,r,c+1);
        }
        else
        {
            Bubble(arr,r-1,0);
        }
    }

}
