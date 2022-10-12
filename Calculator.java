package com.company;

import java.util.Scanner;
class calculator
{

    static void add(int a,int b)
    {
        System.out.println("the sum of the two number is "+(a+b));
    }
    static void sub(int a, int b)
    {
        System.out.println("the substarction of the two number is "+(a-b));
    }
    static void mul(int a,int b)
    {
        System.out.println("the multiplixation of the two number is "+(a*b));
    }

    static void div(int a,int b)
    {
        System.out.println("the division of the two number is "+(a/b));
    }

    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("enter the first number");
            a = sc.nextInt();
            System.out.println("enter the second number");
            b = sc.nextInt();
            char f;
            System.out.println("enter your character to performe operation\n for addition type a\n for substration type s\n for multiplication type m\n for division type d\n for exit type e");
            f = sc.next().charAt(0);
            switch (f) {
                case 'a':
                    add(a, b);
                    break;

                case 's':
                    sub(a, b);
                    break;

                case 'm':
                    mul(a, b);
                    break;

                case 'd':
                    div(a, b);
                    break;

                case 'e':
                    System.exit(0);

                default:
                    System.out.println("you entered wrong character");
                    break;


            }
        }

        }
    }
