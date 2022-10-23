package com.company.Property;

public class RotationCount {
    public static void main(String[] args) {
        int arr[]={7, 9, 11, 12, 15};
    int pivot=findPivot(arr);
        System.out.println(pivot+1);
    }
    static int findPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int nums[],int start,int end,int target){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}
