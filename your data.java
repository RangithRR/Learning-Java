import java.util.Scanner;
class data{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("What is your name: ");
    String name = sc.nextLine();
    System.out.print("What is your mark:");
    Double mark = sc.nextDouble();
    sc.nextLine();
    System.out.print("What is your house address:");
    String address = sc.nextLine();
    
    System.out.println("What is your name: " +name);
    System.out.println("My mark is " +mark/10);
    System.out.println("My address is " +address);

    
    }
}
