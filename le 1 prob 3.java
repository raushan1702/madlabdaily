/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;  
public class Main  
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
int num=sc.nextInt();  
for(int i=1; i <= 10; i++)  
{  
System.out.println(num+" * "+i+" = "+num*i);  
}  
}  
}  
