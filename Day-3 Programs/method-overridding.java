import java.util.*;
class Main extends Human 
{
    public static void main(String[] args) {
        Human h=new Human();
        Animal a=new Animal();
        h.add(2,4);
        h.add(2,4,6);
        a.add(9.9,22.4);
    }
}
class Human extends Animal{
    public void start(){
        System.out.println("Hi this is Human");
    }
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum of two number is "+c);
    }
    public void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Sum of the three numbers is "+d);
    }
}
class Animal
{
    public void add(double a,double b){
        System.out.println("From Animal addition "+(a+b));
    }
}