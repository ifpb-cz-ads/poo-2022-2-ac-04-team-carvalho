import java.util.Scanner;
public class BMExercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
            do{
                day = sc.nextInt();
                if (day == 0) {
                    System.out.println("Operação finalizada");
                }
                if(day == 1){
                System.out.println("Sunday");    
                }
                if (day == 2) {
                System.out.println("Monday");    
                }
                if (day == 3) {
                System.out.println("Tuesday");    
                }
                if (day == 4) {
                System.out.println("Fourth");    
                }
                if (day == 5) {
                System.out.println("Fifth");    
                }
                if (day == 6) {
                System.out.println("Friday");    
                }
                if (day == 7) {
                System.out.println("Saturday");  
                }
            } while (day != 0);
        sc.close();
    }
}