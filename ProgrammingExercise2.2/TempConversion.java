import java.util.Scanner;
public class TempConversion {

    public static void main(String args[]) {
     
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Enter a temperature in degrees Fahrenheit:");
        
	double fahrenheit = sc.nextInt();
        
        double celsius =  (fahrenheit - 32) * 5 / 9;
       
    System.out.println("The temperature in Celsius is:" + celsius);
    
        System.out.println("Enter a temperature in degrees Celsius:");
        
	double Celsius = sc.nextInt();
        
        double Fahrenheit =  Celsius * 9 / 5 + 32;
        
    System.out.println("The temperature in Fahrenheit:" + Fahrenheit);
    
        }
    }