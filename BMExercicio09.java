import java.util.Scanner;
public class BMExercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int x = sc.nextInt();
        while (n <= 20) {
            System.out.println(x);
            n++;
        }
        sc.close();
    }
}