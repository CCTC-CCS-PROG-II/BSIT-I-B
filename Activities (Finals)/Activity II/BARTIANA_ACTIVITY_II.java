import java.util.Scanner;
public class BARTIANA_ACTIVITY_II {
    static void feetToInch(double feet){
        double res = feet * 12;
        System.out.println(res);
    }
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the feet: ");
        double feet = sc.nextDouble();
        feetToInch(feet);
      
      }
      } 
    
