import java.util.Scanner;

public class pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        String amorpm = (time < 12) ? "AM" : "PM";
        System.out.print(amorpm);
    sc.close();
    }
}
