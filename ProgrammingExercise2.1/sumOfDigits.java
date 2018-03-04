import java.util.Scanner;
public class sumOfDigits {

    public static void main(String args[]) {
        
        int s;
        
        int sum = 0, d;
        
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Enter Positive 5 Digit Number:");
        
	s = sc.nextInt();
        
        while (s > 0) {
        
        d = s % 10;
        
        sum = d + sum;
        
        s = s / 10;}
        
     
    System.out.println("The sum of the digits is:" + sum);
    
        }
    }
    
