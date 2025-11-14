import java.util.Scanner;
class percentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter mark for english :");
        int s1=sc.nextInt();
        System.out.println("enter mark for tamil :");
        int s2=sc.nextInt();
        System.out.println("enter mark for science :");
        int s3=sc.nextInt();
        System.out.println("enter mark for maths :");
        int s4=sc.nextInt();
        System.out.println("enter mark for social :");
        int s5=sc.nextInt();
        int total =s1+s2+s3+s4+s5;
        double percentage=(total/500.0)*100;
        System.out.println("total marks ="+total);
        System.out.println("percentage ="+percentage);
        
    }
}
