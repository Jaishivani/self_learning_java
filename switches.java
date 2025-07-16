import java.util.Scanner;

public class pro5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String Day = sc.nextLine();

        switch(Day){
            case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" -> System.out.println(Day + " it's a weekday.");
            case "Saturday" , "Sunday" -> System.out.println(Day + " it's a weekend.");
            default -> System.out.println(Day + " it's not a day.");
        }
        sc.close();
    }
}
