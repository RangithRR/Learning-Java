import java.util.Scanner;
class Positivenegative{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number :");
    int num=sc.nextInt();
    if(num>0)
      System.out.println("the given number is positive");
    else if(num==0)
      System.out.println("the number is zero");
    else if(num<0)
     System.out.println("the number is negative");
     else
     System.out.println("invalid");
    
    
  }
}
