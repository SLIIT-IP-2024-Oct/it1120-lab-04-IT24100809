import java.util.Scanner;
public class IT24100809Lab4Q2{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

float examMarks,labSubMarks,examPercentage,labPercentage,totalPercentage,finalMarks;

System.out.println("please enter the marks (out of 100):");
examMarks=input.nextFloat();
if(examMarks<0||examMarks>100)
    {
     System.out.println("Invalid input for exam marks.");
     return;
    }

System.out.println("Please enter lab submission marks (out of 100):");
labSubMarks=input.nextFloat();
if(labSubMarks<0||labSubMarks>100)
    {
     System.out.println("Invalid input for lab sub marks");
     return;
    }

System.out.println("Please enter the percentage given the exam :");
examPercentage=input.nextFloat();
System.out.println("Please enter the percentage given the lab sub :");
labPercentage=input.nextFloat();

totalPercentage=examPercentage+labPercentage;
if(totalPercentage!=100)
  {
    System.out.println("The percentage must add up to 100. ");
    return;
  }
finalMarks=examMarks*examPercentage/100 + labSubMarks*labPercentage/100;
System.out.println("Final exam marks is  :" + finalMarks);


}
}