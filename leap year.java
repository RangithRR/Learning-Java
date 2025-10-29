import java.util.Scanner;
class Leapyear{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a year :");
    int year=sc.nextInt();
    if (year%400==0 ||(year%4==0 && year%100!=0)){
        System.out.print("the given year is leap :");
        
    }else{
         System.out.print("the given year is not leap :");
    }
  }
}
