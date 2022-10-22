package com.company.Property;

public class Valid_palindrome {
    public static void main(String[] args) {
        String s="maan";
        String ans=k(s);
        System.out.println(ans);

    }
    static String k(String s){
        if(s.length()==0){
            return "";
        }
        return k(s.slice(s.length()-2))+s;

    }
}
