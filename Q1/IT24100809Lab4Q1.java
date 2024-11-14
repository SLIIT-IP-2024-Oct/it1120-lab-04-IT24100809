import java.util.Scanner;
public class IT24100809Lab4Q1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double num;
System.out.println("Enter the number:");
num=input.nextDouble();
if(num>0)
  {
    System.out.println("Positive");
  }
else if(num<0)
  {
    System.out.println("Negative");
  }
else
  { 
    System.out.println("The number is Zero");
  }

}
}