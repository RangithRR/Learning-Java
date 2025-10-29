import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number a :");
        int a=sc.nextInt();
        System.out.print("enter number b :");
        int b=sc.nextInt();
        if(a>b)
        System.out.println("a is big");
        else
         System.out.println("b is big");
    }
}
