import java.util.Scanner;
public class ENCARQUEZ_ACTIVTY_1{
    static int length(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        return sc.nextInt();
    }
    static int width(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        return sc.nextInt();
    }
    public static void main(String [] args){
        long area= (long)length() * (long)width();

        System.out.println("The area of the rectangle is: " + area);
    }
}