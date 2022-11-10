import java.util.Scanner;
public class BMExercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i <= 100; i++){
            if (i % N == 0) {
                System.out.println("Números múltiplos: " + i);
            }
        }
        sc.close();
    }
}