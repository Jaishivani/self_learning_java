import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double pri;
        int Quan;
        double tot;
        
        System.out.print("What items did you buy?:");
        item = sc.nextLine();
        System.out.print("What is the price of the product:");
        pri = sc.nextDouble();
        System.out.print("How the Quantity is?:");
        Quan = sc.nextInt();

        tot = pri *Quan;
        System.out.println("\nYou have bought " + Quan + " " + item + "\s");
        System.out.println("Your total is:" + tot );

        sc.close();
       }
}
