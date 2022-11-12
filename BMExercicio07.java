import java.util.Scanner;
public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        do{
            if (x % 2 == 0) {
                int y = x / 2;
                x = y;
                System.out.println(x);
            }
            else if (x % 2 == 1) {
                int y = 3 * x + 1;
                x = y;
                System.out.println(x);
            }
        } while ( x != 1);
        sc.close();
    }
}