package com.company;


import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args)
    {
        ArrayList<String> citylist = new ArrayList <String>();

        citylist.add("hedrabad");
        citylist.add("pune");
        citylist.add("rajkot");
        citylist.add("ahemdabad");
        citylist.add("mumbai");
        citylist.add("rajshthan");

//        objectname.contains() method is use to check weather the element is present or nor
        // its return only true or flase value

        System.out.println("the delhi is present in this list "+citylist.contains("delhi"));
        System.out.println("the mumbai is present in this list "+citylist.contains("mumbai"));

        // objectname.size() is to use to find the size of the our arraylist

        System.out.println("the size of this arraylist is "+citylist.size());

        //objectname.indexOf is to use to find the index of the element .

        System.out.println("location of the city mumbai is "+citylist.indexOf("mumbai"));

//        objectname.isEmpty is to use check the weather the list is empty or not

        System.out.println("let's check the weather the list is empty or not : "+citylist.isEmpty());

//        objectname.set(index,value) is to use replace the particular value in the list

        citylist.set(1,"kerla");

//        objectname.remove() is to use to delete the value which is present in the arraylist

        citylist.remove(1);
        citylist.remove("mumbai");

//        objectname.get(index) is to use to find the value at particular index

        System.out.println("the value of the index 3 is "+citylist.get(3));

//        objectname.tostring() is to use for the printing all over list
        System.out.println(citylist.toString());
    }
}
