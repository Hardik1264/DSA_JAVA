package com.company;

class vehicle
{
    int speed=126;
    String na="baleno";

    public vehicle(int sp){
        this.speed=sp;
    }

    public vehicle(int a,String s)
    {
        this.speed=a;
        this.na=s;
    }


    public int getspeed()
    {
        return speed;
    }

    public String getstring()
    {
        return na;
    }
}

 class car extends vehicle
{

    String bike;
    public car(int sp,String d)
    {
        super(sp);
        this.bike=d;
        System.out.println("the source code is avalaible at github");
    }

    public String getbike()
    {
        return bike;
    }
}

public class superv {

    public static void main(String[] args)
    {
       car obj2=new car(169,"ktm duke");
        System.out.println("the car speed is "+obj2.getspeed()+" and the car name is "+obj2.getstring()+
                " and bike name is "+obj2.getbike());
    }


}
