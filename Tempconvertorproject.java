import java.util.Scanner;

public class shivpro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the temperature: ");
        Double temp = sc.nextDouble();

        System.out.print("Convert celcius into Fahernheit (c or f): ");
        String unit = sc.next().toUpperCase();

        Double newtemp = (unit.equals("F")) ? (temp-32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.2f°%s",newtemp,unit);
        //System.out.println(newtemp + "°" + unit);
        sc.close();
    }
}
