import java.util.Scanner;
public class BMExercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int x = sc.nextInt();
        do {
            System.out.println(x);
            n++;
        }while (n <= 20);
        sc.close();
    }
}