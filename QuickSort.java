
import java.util.Scanner;

public class QuickSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        int a[];
        System.out.println("Enter a size of an array : ");
        size = sc.nextInt();
        a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " of an array : ");
            a[i] = sc.nextInt();
        }
        QSort(a, 0, size-1);
        System.out.println("Sorted array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }

    public static void QSort(int[] a, int p, int r) {
        int j;
        if (p < r) {
            j = partition(a, p, r);
            QSort(a, p, j-1);
            QSort(a, j + 1, r);
        }
    }

    public static int partition(int a[], int p, int r) {
        int x = a[r];
        int i = p - 1, temp;
        for (int j = p; j < r ; j++) {
            if (a[j] <= x) {
                i = i + 1;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = temp;
        return (i + 1);
    }
}
