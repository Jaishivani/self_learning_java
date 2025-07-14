import java.util.Scanner; 

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double circum;
        
        System.out.print("Enter the radius: ");
        double radi = sc.nextDouble();
        circum = 2 * Math.PI * radi;

        System.out.println("The circumference is " + circum + "cm^2");
        sc.close();
    }   
}
