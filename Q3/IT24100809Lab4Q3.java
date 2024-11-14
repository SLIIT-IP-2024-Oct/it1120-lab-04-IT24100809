import java.util.Scanner;
public class IT24100809Lab4Q3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int number;
String type;
System.out.println("Enter a number:");
number=input.nextInt();
type = (number>0) ? "positive" : (number<0) ? "negative" : "Zero";
System.out.println(type);

}
}