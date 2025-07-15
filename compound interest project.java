import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timecompound;
        int years;
        double amount;

        System.out.print("Enter a principal amt: ");
        principal = sc.nextDouble();

        System.out.print("Enter a interest rate (in %) : ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the no of time compound per years: ");
        timecompound = sc.nextInt();

        System.out.print("Enter the no of Years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate / timecompound, timecompound * years);
        System.out.println("The amt aftr " + years + "is " + amount);
        sc.close();
    }

}
