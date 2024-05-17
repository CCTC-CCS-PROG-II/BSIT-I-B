import  java.util.Scanner;
public class JARDIN_ACTIVITY_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String[]names =new String[5];

	for (int i=0; i<names.length;i++ ){
	System.out.println("Enter name"+(i+1)+" :");
	names[i]=sc.nextLine();}

System.out.println("Enter number of name to select (1-5):");
int name=sc.nextInt();

if (name>=1&&name<=names.length){

System.out.println("You selected: "+ names[name-1]+".");
}
else{
System.out.println("invalid");
}
}
}
 




    
